package SuperPrep;

class Animal2{
   void makeSound(){
        System.out.println("Animal Makes Sound");
    }
}

class Dog2 extends Animal2 {
    @Override
    void makeSound(){
        super.makeSound();
        System.out.println("Dog barks");
    }
}

public class Super2 {
    public static void main(String[] args) {
        Dog2 dog1 = new Dog2();

        dog1.makeSound();
    }
}
