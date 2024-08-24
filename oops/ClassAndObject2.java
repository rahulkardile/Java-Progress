package oops;

class Student {
    String name;
    Number age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
}

public class ClassAndObject2 {
 public static void main(String[] args) {
    Student s1 = new Student();

    s1.name = "Rahul";
    s1.age = 21;

    s1.printInfo();

 }   
}
