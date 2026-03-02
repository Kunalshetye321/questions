package Java8.LambdaExpression.LambdaTypes.LambdaWithOneArguments;

interface FunInterface{
    void normalFun(int price);
}

public class LambdaWithOneArg {
    public static void main(String[] args) {
        FunInterface temp = (price) -> System.out.println("Normal fun for $" + price);
        temp.normalFun(90);
    }
}
