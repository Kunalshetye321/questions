package Java8.FunctionInterfaces.PredicateFnInf.PredicateOr;

import java.util.function.Predicate;

public class PredicateOr {
    public static void main(String[] args) {
        Predicate<Integer> lesstThanTen = (e) -> e < 10;
        Predicate<Integer> greaterThanTwenty = (e) -> e > 20;

        //Test value is less than 10 || greater than 20
        Predicate<Integer> chainPredicate = lesstThanTen.or(greaterThanTwenty);

        System.out.println(chainPredicate.test(11));
        System.out.println(chainPredicate.test(22));
        System.out.println(chainPredicate.test(9));
    }
}
