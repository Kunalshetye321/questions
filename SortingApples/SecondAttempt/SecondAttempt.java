package SortingApples.SecondAttempt;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Second Attempt is to create a function to add sorting logic
public class SecondAttempt {
    public static void main(String[] args) {
        Apple a1 = new Apple(10, "Red");
        Apple a2 = new Apple(20, "Blue");
        List<Apple> apples = Arrays.asList(a1, a2);

        System.err.println("Filter Red Apples" + filterByColor(apples, "Red"));

        System.err.println("Filter Blue Apples" + filterByColor(apples, "Blue"));
    }
    
    public static List<Apple> filterByColor(List<Apple> apples, String targetColor) {
        List<Apple> targetApples = new ArrayList<>();

        for(Apple a: apples) {
            if(a.color.equalsIgnoreCase(targetColor))
                targetApples.add(a);
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
