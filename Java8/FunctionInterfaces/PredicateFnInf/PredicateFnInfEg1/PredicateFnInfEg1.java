package Java8.FunctionInterfaces.PredicateFnInf.PredicateFnInfEg1;

import java.util.function.Predicate;

public class PredicateFnInfEg1 {
    public static void main(String[] args) {
        //1. Predicate<Integer> 
        //       Integer derived from generics type i.e. we can
        //       also have Predicate<String>, Predicate<List<Long>>, etc
        //
        //2. (s) -> (s > 100); 
        //       It is a lambda expression shorthand for anonymous function 
        //       and clean code practise
        Predicate<Integer> salaryGreaterThanHundred = (s) -> (s > 100);

        Integer ramSalary = 20;
        Integer ramuSalary = 120;
        Integer rajSalary = 100;

        System.out.println("Is Ram Salary Greater than 100: " 
        + salaryGreaterThanHundred.test(ramSalary));
        System.out.println("Is Ramu Salary Greater than 100: " 
        + salaryGreaterThanHundred.test(ramuSalary));
        System.out.println("Is Raj Salary Greater than 100: " 
        + salaryGreaterThanHundred.test(rajSalary));
    }
}
