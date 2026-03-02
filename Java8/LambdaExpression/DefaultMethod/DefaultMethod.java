package Java8.LambdaExpression.DefaultMethod;

interface MyDefault{
    void display();

    default void message() {
        System.out.println("This is default method");
    }
}

public class DefaultMethod  implements MyDefault {

    public void display() {
        System.out.println("This is display Sue");
    }

    public void message() {
        MyDefault.super.message();
    }

    public static void main(String[] args) {
        MyDefault temp = new DefaultMethod();
        temp.display();
        temp.message();
    }
}
