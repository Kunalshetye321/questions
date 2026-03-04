package Java8.FunctionInterfaces.FunctionalInf.FunctionInfAndThenEg;

import java.util.function.Function;

public class FunctionInfAndThenEg {
    public static void main(String[] args) {
        //For chaining two functional interfaces we use andThen
        Function<Integer, Double> half = (a) -> a/2.0;

        Function<Double, Double> secondTimesHalf = (a) -> a/2.0;

        //Why Integer, Double coz
        // half<Int, Dble>
        // secondTimesHald<Dble extends Int, Dble extends Dble>
        // and syntax of andThen is => <Int, Dble> andThen(<Dble extends Int, Dble extends Dble> other)
        Function<Integer, Double> oneForth = half.andThen(secondTimesHalf);

        System.out.println("oneForth: " + oneForth.apply(Integer.valueOf(100)));
    }
}
