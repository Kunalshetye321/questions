package Java8.FunctionInterfaces.BiConsumerFnInf;

import java.util.function.BiConsumer;

public class BiConsumerFnInf {
    public static void main(String[] args) {
        BiConsumer<Integer, String> biCon = (i, s) -> {
            System.out.println("First Argument Integer: " + i);
            System.out.println("Second Argument String: " + s);
        } ;

        biCon.accept(10, "20");
    }
}
