import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparatorMain {
    public static void main(String[] args) {
        Student s1 = new Student("Kunal", 22);
        Student s2 = new Student("Mandar", 20);
        Student s3 = new Student("Ratnadip", 19);

        List<Student> sList = new ArrayList<>(Arrays.asList(s1,s2,s3));
        System.out.println("Sorted List: "+ sList);

        Collections.sort(sList, new StudentComparator());

        System.out.println("Sorted List: "+ sList);

    }
}

class StudentComparator implements Comparator<Student> {
    
    public int compare(Student s1, Student s2) {
        int nameCompare = s1.getName().compareTo(s2.getName());
        int ageCompare = s1.getAge().compareTo(s2.getAge());
        return (nameCompare == 0)? ageCompare : nameCompare; 
    }

}

class Student {
    String name;
    Integer age;

    Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {return this.name;}

    public void setName(String name) {this.name = name;}

    public Integer getAge() {return this.age;}

    public void setAge(Integer age) {this.age = age;}

    public String toString() {
        return "Student[name:" + this.name + ", age: " + this.age + "]"; 
    }
}