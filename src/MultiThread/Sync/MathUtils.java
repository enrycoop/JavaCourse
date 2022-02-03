package MultiThread.Sync;

public class MathUtils {
    
    // aggiungendo la key word synchronized, soltanto un Thread alla volta può eseguire il metodo
    /* synchronized public void getMultiples(int n){
        try{
            for (int i =1 ; i<=3;i++ ){
                System.out.println(i*n);
                Thread.sleep(400);
            }
        }catch(Exception e){
            System.out.println("Exception caught -> "+ e);
        }

    } */

    //Oppure è possibile sincronizzare soltanto una porzione di codice
    public void getMultiples(int n){
        synchronized (this){
            try{
                for (int i =1 ; i<=3;i++ ){
                    System.out.println(i*n);
                    Thread.sleep(400);
                }
            }catch(Exception e){
                System.out.println("Exception caught -> "+ e);
            }
        }

    }

}
