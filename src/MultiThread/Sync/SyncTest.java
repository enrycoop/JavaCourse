package MultiThread.Sync;

public class SyncTest {
    public static void main(String args[]){
        MathUtils mu = new MathUtils();

        // Entrambi i Thread usano mu
        MyThread1 t1 = new MyThread1(mu);
        Thread t2 = new Thread( new MyThread2(mu));
        t1.start();
        t2.start();
    }
}
