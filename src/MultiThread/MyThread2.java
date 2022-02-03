package MultiThread;

class MyThread2 implements Runnable{
    
    private int id;

    public MyThread2(int id){
        this.id = id;
    }

    @Override
    public void run(){
        try{
            System.out.println("Thread"+ id +" Runnable running");
        }catch(Exception e ){
            System.out.println("Exception caught -> "+ e);
        }
    }
}
