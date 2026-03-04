package Java8.FunctionInterfaces.FunctionalInf.FunctionInfIdentity;

import java.util.function.Function;

//Identity method returns argument itself.
public class FunctionInfIdentity {
    public static void main(String[] args) {
        Function<Integer, Integer> i = Function.identity();

        System.out.println(i.apply(10));
    }
}
