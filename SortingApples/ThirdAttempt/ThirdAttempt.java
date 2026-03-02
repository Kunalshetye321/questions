package SortingApples.ThirdAttempt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Third Attempt: Filtering with every attribute you can think
public class ThirdAttempt {
    public static void main(String[] args) {
        Apple a1 = new Apple(10, "Red");
        Apple a2 = new Apple(20, "Red");
        Apple a3 = new Apple(20, "Blue");
        List<Apple> apples = Arrays.asList(a1, a2, a3);

        System.err.println("Filter red apple: " + 
            filterByColorOrWeight(apples, "Red", -1, true)
        );

        System.err.println("Filter apple of 10kg: " + 
            filterByColorOrWeight(apples, "Red", 10, false)
        );

    }

    public static List<Apple> filterByColorOrWeight(List<Apple> apples, String targetColor, 
        int weight, boolean flag) {
        List<Apple> targetApples = new ArrayList<>();

        for(Apple a: apples) {
            if((flag && a.color.equalsIgnoreCase(targetColor))
            || (!flag && a.weight == weight)) {
            targetApples.add(a);
        }
        }

        return targetApples;
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