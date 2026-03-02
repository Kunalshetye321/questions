package SortingApples.FirstAttempt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Straight Forward Approach
//Logic inside Main directly
public class FirstAttempt {
    public static void main(String[] args) {
        Apple a1 = new Apple(10, "Red");
        Apple a2 = new Apple(20, "Blue");

        List<Apple> apples = Arrays.asList(a1, a2);
        List<Apple> targetApples = new ArrayList<Apple>();

        for(Apple tempApple: apples) {
            if(tempApple.color.equalsIgnoreCase("Red")) {
                targetApples.add(tempApple);
            }
            
        }

        System.err.println("Red Apples: " + targetApples);
    }
}

class Apple {
    int weight;
    String color;

    Apple(int weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String toString() {
        return "Apple[weight:" + this.weight + ", color: " + this.color + "];";
    }
}
