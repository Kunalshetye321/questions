package Java8.LambdaExpression.LambdaTypes.LambdaWithZeroArguments;

interface FunInterface{
    void normalFun();
}
public class LambdaWithZeroArg {
    public static void main(String[] args) {
        FunInterface temp = () -> System.out.println("This is normal fun method");
        temp.normalFun();
    }
}
