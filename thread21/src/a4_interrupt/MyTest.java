package a4_interrupt;

public class MyTest {

    public static void main(String[] args) {
        try {
            System.out.println("statr");
            int i = 5;
            if(i>1){
                throw  new Exception("text exception");
            }
        }catch (Exception e){
            System.out.println("exception");
        }finally {
            System.out.println("final");
        }
    }
}
