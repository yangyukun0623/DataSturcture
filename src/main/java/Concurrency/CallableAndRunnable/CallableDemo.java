package Concurrency.CallableAndRunnable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class CallableDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> callable = new Callable<String>() {
            public String call() throws Exception {
                return "ikun";
            }
        };

        FutureTask<String> task = new FutureTask<String>(callable);
        Thread t = new Thread(task);
        t.start();//启动线程
        System.out.println(task.get());
        task.cancel(true);//取消线程
    }
}
