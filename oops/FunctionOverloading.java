package oops;

class Student2 {
    String name;
    int age;

    // Function overloading
    public void printInfo(String name){
        System.out.println(this.name);
    }

    public void printInfo(int age){
        System.out.println(age);
    }

    public void printInfo(String name, int age){
        System.out.println(name);
        System.out.println(age);
    }
}

public class FunctionOverloading {
    public static void main(String[] args) {
        Student2 s1 = new Student2();
        s1.name = "Rahul";
        s1.age = 21;

        s1.printInfo(s1.name, s1.age);
    }
}
