import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class q1 {
    
    public static void main(String[] args) {
        
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        System.out.println("Initial List: " + list);

        //Filter Even Numbers from a List

        List<Integer> filterdEvenNumberList =  list.stream()
        .filter((element) -> element%2==0)
        .collect(Collectors.toList());

        System.out.println("Filtered List: " + filterdEvenNumberList);
    }

}