package Java8.MethodReferences.MethodRefForInstanceMethods;

import java.util.Arrays;
import java.util.List;

public class RefForInstanceMethod {

    public void display(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,9,11,344);

        RefForInstanceMethod instanceMethod = new RefForInstanceMethod();

        numbers.stream()
        .forEach(instanceMethod::display);
    }
}
