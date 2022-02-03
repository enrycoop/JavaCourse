package ConcurrencyUtils;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class FutureTest {
    public static void main(String args[]){
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Future<String> future = executorService.submit(() -> {
            Thread.sleep(5000);
            return "Done!";
        });

        try{
            while(!future.isDone()){
                System.out.println("Task in progres....");
                Thread.sleep(500);
            }
            System.out.println("Task completed!");
            String res  = future.get(3000, TimeUnit.MILLISECONDS); //timeout for getting value (3 secs)
            System.out.println("Result is : "+res);
            executorService.shutdown();
        }catch(InterruptedException | ExecutionException | TimeoutException e){
            future.cancel(true);
            System.out.println(future.isDone());
            System.out.println(future.isCancelled());
        }
    }
}
