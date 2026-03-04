package Java8.MethodReferences.MethodRefForStaticMethods;

import java.util.Arrays;
import java.util.List;

public class RefForStaticMethod {
    public static void display(Integer number) {
        System.out.println(number);
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,5,9,11,344);

        //without method ref
        numbers.stream()
        .forEach((e) -> System.out.println(e));

        //with method ref
        numbers.stream()
        .forEach(RefForStaticMethod::display);
    }
}
