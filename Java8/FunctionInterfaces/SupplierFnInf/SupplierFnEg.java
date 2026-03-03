package Java8.FunctionInterfaces.SupplierFnInf;

import java.util.function.Supplier;

public class SupplierFnEg {
    public static void main(String[] args) {
        Supplier<Double> randomValue = () -> Math.random();

        System.out.println(randomValue.get()*1000);
    }
}
