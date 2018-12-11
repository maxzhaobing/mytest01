import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<Integer>(
                Arrays.asList(1,2,3,4,5)
        );
        integers.add(100);

        List<Integer> integers2 = Arrays.asList(1,2,3,4,5);
        //integers2.add(100);

        System.out.println("==========");
        System.out.println(integers);
        System.out.println(integers2);
    }
}
