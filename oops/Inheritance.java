package oops;

class Shape {
    String color;
}

class Tringle extends Shape {
    public void display() {
        System.out.println(this.color);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Tringle t1 = new Tringle();
        t1.color = "red";

        t1.display();
    }
}
