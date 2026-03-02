package Java8.LambdaExpression.AnonymousClass;

@FunctionalInterface
interface Animal {
    public void heyAnimal();
}

public class AnonymousClass {
    public static void main(String[] args) {
        Animal animal = new Animal(){
            public void heyAnimal() {
                System.err.println("Hey Giraffe");
            }
        };

        animal.heyAnimal();
    }
}
