public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;

    public String status(){
        return "#"+id+"("+(countDown > 0?countDown:"Liftoff!")+")";
    }

    @Override
    public void run() {
        while (countDown-- > 0){
            System.out.println(status());
            Thread.yield();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        LiftOff liftOff1 = new LiftOff();
        LiftOff liftOff2 = new LiftOff();
        liftOff1.run();
        liftOff2.run();

        System.out.println("----------------");

        new Thread(new LiftOff()).start();
        new Thread(new LiftOff()).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                int countDown = 10;
                while (countDown-- > 0){
                    System.out.println("ttt"+countDown);
                }
            }
        }).start();
        Thread.sleep(5000);
    }
}
