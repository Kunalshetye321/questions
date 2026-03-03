package Sorting.Comparable.ComparableEg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>{
    String name;
    int marks;
    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    // Returns negative integer if this.obj1 < other.obj2.
    // Returns 0 if this.obj1 == other.obj2.
    // Returns positive integer if this.obj1 > other.obj2.
    @Override
    public int compareTo(Student other) {
        return this.marks - other.marks;  // ascending order by marks
    }

    @Override
    public String toString() {
        return name + ": " + marks;
    }
}

public class ComparableEg {
     public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 92));
        students.add(new Student("Charlie", 78));

        Collections.sort(students);

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
