package Java8.FunctionInterfaces.ObjectsReqNotNullMethod;

import java.util.Objects;

/*
The primary purpose of the requireNonNull() methods is to check if an 
object reference is null and throw a NullPointerException if it is.
Primarily used for parameter validation in methods and constructors.
*/
public class ObjectsReqNotNull {
    public static void main(String[] args) {
        Integer salary = null;
        Objects.requireNonNull(salary);
    }
}
