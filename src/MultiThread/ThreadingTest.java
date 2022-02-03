package MultiThread;

public class ThreadingTest {
    public static void main(String args[]){
        int tNum = 3;

        for (int i = 1; i<=tNum; i++){
            MyThread t = new MyThread(i);
            t.start();

            Thread t2 = new Thread( new MyThread2(i) );
            t2.start();
        }
    }
}
