package Java8.FunctionInterfaces.FunctionalInf.FunctionalInfEg;

import java.util.function.Function;

public class FunctionalInfEg {
    public static void main(String[] args) {
        Function<Integer, Double> halfOfANumber = (a) -> a/2.0;

        System.out.println("Hald of 100: " + halfOfANumber.apply(100));
    }
}
