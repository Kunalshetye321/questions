package Java8.FunctionInterfaces.PredicateFnInf.PredicateNegate;

import java.util.function.Predicate;

public class PredicateNegate {
    public static void main(String[] args) {
        Predicate<Integer> pred = (e) -> e > 0;

        System.out.println("Is 10 greater than 0: " + pred.test(10));
        System.out.println("Negate of (Is 10 greater than 0): " + pred.negate().test(10));
    }
}
