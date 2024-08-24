package oops;

class Pen {
    String color;
    String type;
    
    public void write(){
        System.out.println("write something!");
    }

    public void getColor(){
        System.out.println(this.color);
    }

}

public class ClassAndObject {
    public static void main(String[] args) {
            Pen pen1 = new Pen();
            Pen pen2 = new Pen();

            pen1.color = "blue";
            pen1.type = "gel";

            pen1.write();
            pen1.getColor();

            pen2.color = "green";
            pen2.type = "gel";

            pen2.getColor();
            
        }    
}
