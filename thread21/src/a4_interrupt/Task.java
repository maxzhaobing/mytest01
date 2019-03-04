package a4_interrupt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;

public class Task implements Runnable {
    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        try{
            int i = 0;
//            while(!Thread.interrupted()){ // 无异常 interrupted():获取中断状态并重置中断状态
//            while(!Thread.currentThread().isInterrupted() && i<20000){ // task 异常：java.lang.InterruptedException: sleep interrupted
            while(i<20000){ // task 异常：java.lang.InterruptedException: sleep interrupted
                System.out.println("i will wait:"+i);
                i++;
            }

            // 中断的线程在阻塞时 会抛出异常
            // 执行中的线程若不处理中断状态且不阻塞，会正常执行结束
            System.out.println("线程将被阻塞");
            Thread.sleep(1000);

            System.out.println("task finish");


        }catch (Exception e){
            System.out.println(" task 异常："+e);
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        try {
            ExecutorService executorService = Executors.newCachedThreadPool();
            executorService.submit(new Task());
            TimeUnit.MILLISECONDS.sleep(4);


            executorService.shutdownNow();
            System.out.println("shutdownNow");
            TimeUnit.MILLISECONDS.sleep(4);
            System.out.println("finish");
        }catch (Exception e){
            System.out.println("main 异常："+e);
            e.printStackTrace();
        }

    }
}
