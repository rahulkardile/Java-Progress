package org.Learn;

public class Dev {

    private int age;
    private Laptop laptop;

    public Dev(){
        System.out.println("Dev Constructore . . . ");
    }

    public Dev(int age) {
        this.age = age;
    }

    public Dev(Laptop laptop){
        this.laptop = laptop;
        System.out.println("Laptop Constructer from Dev . . . ");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Laptop getLaptop() {
        return laptop;
    }

    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public void build(){
        System.out.println("Working on Awesome project . . . ");
    }

}
