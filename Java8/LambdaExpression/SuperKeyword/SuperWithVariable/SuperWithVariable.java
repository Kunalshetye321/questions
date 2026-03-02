package Java8.LambdaExpression.SuperKeyword.SuperWithVariable;

class Fruit {
    int price = 180;
}

class Apple extends Fruit {
    int price = 200;

    public void fruitPrice() {
        System.out.println("price: " + price);

        System.out.println("Super price: " + super.price);
    }
}

public class SuperWithVariable {
    public static void main(String[] args) {
        
        Apple apple = new Apple();
        apple.fruitPrice();
    }
}
