package inheritance;

import bank;

class Shape {
    public void area(){
        System.out.println("Display Area");
    }
}

// Single Level Inheritance
class Tringle extends Shape {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// multi level inheritace
class EquilateralTringle extends Tringle {
    public void area(int l, int h){
        System.out.println(1/2*l*h);
    }
}

// hirarchial inheritence
class Circle extends Shape {
    public void area(int r){
        System.out.println((3.14)*r*r);
    }
}

public class singleInheritance {
        public static void main(String[] args) {
            bank.Account ac1 = new bank.Account();
            ac.name = "customer 1";
        }
}
