package MultiThread.Sync;

class MyThread2 implements Runnable{
    
    private MathUtils mu;

    public MyThread2(MathUtils mu){
        this.mu = mu;
    }

    @Override
    public void run(){
        try{
            mu.getMultiples(5);
        }catch(Exception e){
            System.out.println("Exception caught -> "+ e);
        }
    }
}

