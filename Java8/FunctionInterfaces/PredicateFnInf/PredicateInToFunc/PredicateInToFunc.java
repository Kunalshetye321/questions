package Java8.FunctionInterfaces.PredicateFnInf.PredicateInToFunc;

import java.util.function.Predicate;

//Passing predicate into function
public class PredicateInToFunc {

    static void pred(int testValue, Predicate<Integer> condn) {
        Boolean res = condn.test(testValue);
        System.out.println("Conditon{(e) -> e > 10} for "+ testValue +"  is " + res);
    }

    public static void main(String[] args) {
        PredicateInToFunc.pred(50, (e) -> e > 10);
        PredicateInToFunc.pred(9, (e) -> e > 10);
        PredicateInToFunc.pred(10, (e) -> e > 10);
    }
}
