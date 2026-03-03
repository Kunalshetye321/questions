package Java8.FunctionInterfaces.ConsumerFnInf.ConsumerAndThenException;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/*
Exception in thread "main" java.lang.UnsupportedOperationException
Why because we cannot change size of list at line 19.
Alternatively, we can use set to update element by position.
*/
public class ConsumerAndThen {
    public static void main(String[] args) {
        //Consumer 1
        Consumer<List<Integer>> modify = (list) -> {
            for(int i = 0; i < list.size(); i++) {
                Integer e = list.get(i);
                e = e *2;
                list.add(i, e);
            }
        };

        //Consumer 2
        Consumer<List<Integer>> display = (list) -> {
            for(int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
            }
        };

        //andThen
        Consumer<List<Integer>> modifyAndDisplay = modify.andThen(display);

        List<Integer> tempList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        modifyAndDisplay.accept(tempList);
    }
}
