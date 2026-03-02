package Java8.LambdaExpression.FunInterface;

@FunctionalInterface
interface Fruits {
    String myFruit();
}

/*
Functional Interface
*/
public class FunInterface {
    
    public static void main(String[] args) {
        Fruits fruit = new Fruits() {
            public String myFruit() {
                return "I am an Apple.";
            } 
        };
        System.err.println(fruit.myFruit());
    }
    
}
