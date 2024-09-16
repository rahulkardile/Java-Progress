package SuperPrep;

class Animal {
    String name;
    Animal(String name){
        this.name = name;
        System.out.println("Animal Constructor");
    }
}

class Dog extends Animal {
    Dog(String name){
        super(name);
        System.out.println("Dog Constructor");
    }
}

public class Super1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
    }
}
