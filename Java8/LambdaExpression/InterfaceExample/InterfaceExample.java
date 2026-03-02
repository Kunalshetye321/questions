package Java8.LambdaExpression.InterfaceExample;

interface Fruit{
    //Implicitly public, static & final
    int price = 190;

    //public & abstract
    void FruitName();
}

class Apple implements Fruit{
    public void FruitName() {
        System.out.println("My name is Apple");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Fruit apple = new Apple();
        apple.FruitName();;
    }
}
