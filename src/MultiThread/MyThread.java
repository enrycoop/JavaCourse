package MultiThread;

class MyThread extends Thread {

    private int id;

    public MyThread(int id){
        this.id = id;
    }

    @Override
    public void run(){
        try{
            System.out.println("Thread" + id + " is running..");
        }catch(Exception e){
            System.out.println("Exception caught -> "+ e);
        }
    }
}
