import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestToString {
    public static void main(String[] args) {
        Integer[] a = {1,2,3};
        Integer[][] b = {
                {1,2,3},{4,5,6}
        };
        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println(Arrays.deepToString(b));

    }
}
