package Annotation.jsonSer;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerAnnotationProcess {

    private void checkIfSerializable(Object obj) throws JsonSerializationException {
        if(Objects.isNull(obj)){
            throw new JsonSerializationException("Object to Serialize is null");
        }

        Class<?> cl = obj.getClass();
        if (!cl.isAnnotationPresent(JsonSerializable.class)){
            throw new JsonSerializationException("The class "+
                    cl.getSimpleName()+
                    " is not annotated with JsonSerializable");
        }
    }

    private void initializeObj (Object obj) throws Exception {
        Class<?> cl = obj.getClass();
        for (Method method : cl.getDeclaredMethods()){
            if (method.isAnnotationPresent(Init.class)){
                method.setAccessible(true); //initNames is PRIVATE so we have to make it accessible
                method.invoke(obj);
            }
        }
    }

    private String getJsonString(Object obj) throws Exception {
        Class<?> cl = obj.getClass();
        Map<String,String> jsonElemMap = new HashMap<>();

        for (Field field : cl.getDeclaredFields()){
            field.setAccessible(true);
            if (field.isAnnotationPresent(JsonElement.class)){
                jsonElemMap.put(getKey(field), (String) field.get(obj));
            }
        }

        String jsonString = jsonElemMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + jsonString + "}";
    }

    private String getKey(Field field) {
        JsonElement jsonElementAnnotation =  field.getAnnotation(JsonElement.class);
        String key =  jsonElementAnnotation.key().equals("")  ? field.getName() : jsonElementAnnotation.key()  ;
        return key;
    }

    public String convertToJson (Object obj) throws JsonSerializationException {
        try{
            checkIfSerializable(obj);
            initializeObj(obj);
            return getJsonString(obj);

        } catch (JsonSerializationException | Exception e){
            throw new JsonSerializationException(e.getMessage());
        }
    }
}
