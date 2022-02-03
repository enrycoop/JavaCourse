package Annotation;

import java.lang.reflect.Method;

//@MyCustomAnnotation(value = 10) <-- Se la metto qui ho un errore
public class MyClass{

    @MyCustomAnnotation(value = 10)
    public void sayHello(){
        System.out.println("Hello!");
    }

    public static void main(String args[]) throws Exception{
        MyClass c = new MyClass();

        Method met = c.getClass().getMethod("sayHello");
        MyCustomAnnotation myAnnotation = met.getAnnotation(MyCustomAnnotation.class);

        System.out.println(myAnnotation.value());
    }
}