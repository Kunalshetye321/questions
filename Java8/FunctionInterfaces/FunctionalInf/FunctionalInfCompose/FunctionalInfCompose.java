package Java8.FunctionInterfaces.FunctionalInf.FunctionalInfCompose;

import java.util.function.Function;

public class FunctionalInfCompose {
    public static void main(String[] args) {
        Function<Integer, Double> oneForth = (a) -> a/4.0;

        Function<Integer, Integer> twiceOfNum = (a) -> a*2;

        //Diff b.w. andThen vs compose
        //andThen: half will execute first and then twiceOfNum
        //compose: twiceOfNum will execute first then half
        Function<Integer, Double> doubleThenOneForth = oneForth.compose(twiceOfNum);

        System.out.println("doubleThenOneForth: " + doubleThenOneForth.apply(Integer.valueOf(100)));

    }
}
