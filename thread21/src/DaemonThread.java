import java.util.concurrent.TimeUnit;

/**
 * 后台线程
 */
public class DaemonThread implements Runnable{


    @Override
    public void run() {
        try{
            while (true){
                System.out.println(Thread.currentThread()+" "+this);
                TimeUnit.MILLISECONDS.sleep(100);
            }
        }catch (Exception e){

        }
    }


    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<=5;i++){
            Thread daemon = new Thread(new DaemonThread());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All Start...");
        TimeUnit.MILLISECONDS.sleep(210);
    }
}
