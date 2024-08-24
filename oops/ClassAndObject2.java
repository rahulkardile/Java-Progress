package oops;

class Student {
    String name;
    Number age;

    public void printInfo() {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    // Constructor fun called
    // This is non parametrized Constructor and this is the first of constructore
    
    Student() {
        System.out.println("Constructore is called");
    }

    // this is second type of constructre
    // parameterized constructore
    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // This is a copy constructore fun
    // this constr. copy all the info from anther student abjects
    Student(Student s2){
        this.name = s2.name;
        this.age = s2.age;
    }

}

public class ClassAndObject2 {
    public static void main(String[] args) {
        Student s1 = new Student();

        s1.name = "Rahul";
        s1.age = 21;
        s1.printInfo();

        Student s2 = new Student("Bhakti", 20);
        s2.printInfo();

        Student s3 = new Student(s2);
        s3.printInfo();

    }
}
