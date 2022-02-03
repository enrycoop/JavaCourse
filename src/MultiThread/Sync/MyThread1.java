package MultiThread.Sync;

class MyThread1 extends Thread {

    private MathUtils mu;

    public MyThread1(MathUtils mu){
        this.mu = mu;
    }

    @Override
    public void run(){
        try{
            mu.getMultiples(3);
        }catch(Exception e){
            System.out.println("Exception caught -> "+ e);
        }
    }
}
