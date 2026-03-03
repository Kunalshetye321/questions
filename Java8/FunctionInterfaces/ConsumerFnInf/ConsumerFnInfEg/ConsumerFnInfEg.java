package Java8.FunctionInterfaces.ConsumerFnInf.ConsumerFnInfEg;

import java.util.function.Consumer;

public class ConsumerFnInfEg {
    public static void main(String[] args) {
        Consumer<Integer> display = (e) -> System.out.println("Display element: " + e);

        display.accept(10);
        display.accept(21);
        display.accept(999);
    }
}
