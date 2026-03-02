import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class q2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5,3,66,22,4444,1,66,1111,44,32));
        System.out.println("Initial List: " + list);

        //Find Maximum in a List
        list.stream()
        .max(null)
    }
}