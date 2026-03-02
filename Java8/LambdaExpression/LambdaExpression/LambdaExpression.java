package Java8.LambdaExpression.LambdaExpression;

@FunctionalInterface
interface Add {
    int addition(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        //using anonymous function
        Add add = new Add() {
            public int addition(int a, int b) {
                return a+b;
            }
        };
        System.err.println("19 + 2 = " + add.addition(19, 2));

        //using lambda expression
        Add add2 = (a,b) -> {
            return a+b;
        };
        System.err.println("22 + 54 = " + add2.addition(22, 54));
    }
}
