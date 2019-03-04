import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorTest {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService exec = Executors.newCachedThreadPool();
//        ExecutorService exec = Executors.newSingleThreadExecutor();
//        ExecutorService exec = Executors.newScheduledThreadPool(5);
//        ExecutorService exec = Executors.newFixedThreadPool(5);
        for(int i=0;i<5;i++){
            exec.execute(new LiftOff());
        }
        System.out.println("finish");
        exec.shutdown();
    }
}
