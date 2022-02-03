package ConcurrencyUtils;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String args[]){
        executorInvoke();
        exectorServiceInvoke();
        threadpool();
    }

    private static void executorInvoke(){
        Executor executor = new Caller();

        executor.execute( () -> { // IT IS AN ARROW FUNCTION (lambda)
            System.out.println("executor is running!");
        });
    }

    private static void exectorServiceInvoke(){
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(() -> {
            System.out.println("ExecutorService running!");
        });

        executorService.shutdown(); //finisce i compiti in submit e NON ne accetta di nuovi
    }

    private static void threadpool(){
        Runnable tsk1 = () -> {
            try{
                Thread.sleep(1000);
                System.out.println("I'm tsk1 in Thread "+ Thread.currentThread().getName());
            }catch(InterruptedException e){
                System.out.println("Caught Interrupted exception in tsk1");
            }
        };

        Runnable tsk2 = () -> {
            try{
                Thread.sleep(500);
                System.out.println("I'm tsk2 in Thread "+ Thread.currentThread().getName());
            }catch(InterruptedException e){
                System.out.println("Caught Interrupted exception in tsk2");
            }
        };

        Runnable tsk3 = () -> {
            try{
                Thread.sleep(800);
                System.out.println("I'm tsk3 in Thread "+ Thread.currentThread().getName());
            }catch(InterruptedException e){
                System.out.println("Caught Interrupted exception in tsk3");
            }
        };

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(tsk1);
        executorService.submit(tsk2);
        executorService.submit(tsk3);
        executorService.shutdown();
    }
}
