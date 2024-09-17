package CollectionFrame.Set.TreeSetDS;

import java.util.*;

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student { " +
                " 'name = " + name + "\'" +
                ", 'rollNo = " + rollNo +
                "'} \n";
    }

    @Override
    public boolean equals(Object o){
        if(this == o) return true;

        if(o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override public int hashCode(){
        return Objects.hash(rollNo);
    }
}

public class CustomTreeSet {
    public static void main(String[] args) {
        Set<Student> studentsSet = new HashSet<>();

        studentsSet.add(new Student("Shantanu Nirphal", 1));
        studentsSet.add(new Student("Bhakti Purnale", 2));
        studentsSet.add(new Student("Rahul Sonawane", 3));
        studentsSet.add(new Student("Rahul Kardile", 4));
        studentsSet.add(new Student("Shubh Sawai", 5));

        System.out.println(studentsSet);

    }
}
