package Java8.FunctionInterfaces.PredicateFnInf.PredicateChaining;

import java.util.function.Predicate;

public class PredicateChaining {
    public static void main(String[] args) {
        Predicate<Integer> greaterThanTen = (e) -> e > 10;
        Predicate<Integer> lessThanTwenty = (e) -> e < 20;

        Predicate<Integer> chainPredicate = greaterThanTen.and(lessThanTwenty);

        System.out.println(chainPredicate.test(11));
        System.out.println(chainPredicate.test(22));
        System.out.println(chainPredicate.test(9));
        
    }
}