package Java8.LambdaExpression.SuperKeyword.SuperWithMethod;

class Fruit{
    void displayFruit(){
        System.out.println("I am fruit");
    }
}

public class SuperWithMethod extends Fruit {

    @Override
    public void displayFruit() {
        System.out.println("I am Apple");
    }

    public void myFruit() {
        displayFruit();

        super.displayFruit();
    }
    
    public static void main(String[] args) {
        SuperWithMethod temp = new SuperWithMethod();
        temp.myFruit();
    }
    
}
