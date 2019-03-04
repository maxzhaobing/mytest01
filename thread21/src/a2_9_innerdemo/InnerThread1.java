package a2_9_innerdemo;

import java.util.concurrent.TimeUnit;

/**
 * JAVA编程思想 21.2.9 page：666
 */
public class InnerThread1 {
    private int countDown = 5;
    private Inner inner;

    private class Inner extends Thread{
        Inner(String name){
            super(name);
            start();
        }
        public void run(){
            try {
                while (true){
                    System.out.println(this);
                    if(--countDown == 0){
                        return;
                    }
                    sleep(10);
                }
            }catch (Exception e){
                System.out.println("exception...");
            }
        }
        public String toString(){
            return getName()+":"+countDown;
        }
    }

    public InnerThread1(String name) {
        inner = new Inner(name);
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i=0;i<3;i++){
            new InnerThread1("my"+i);
        }
        TimeUnit.MILLISECONDS.sleep(200);
    }
}
