package Java8.FunctionInterfaces.ConsumerFnInf.ConsumerAndThen;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerAndThen {
    public static void main(String[] args) {
        //Consumer 1
        Consumer<List<Integer>> displayFirst = (list) -> {
            System.out.println("First");
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i) + ", ");
            }
        };

        //Consumer 2
        Consumer<List<Integer>> displaySecond = (list) -> {
            System.out.println("\nSecond");
            for(int i = 0; i < list.size(); i++) {
                System.out.print(list.get(i)*10 + ", ");
            }
        };

        //andThen
        Consumer<List<Integer>> displayTwice = displayFirst.andThen(displaySecond);

        List<Integer> tempList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        displayTwice.accept(tempList);
    }
}
