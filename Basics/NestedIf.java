package Basics;

public class NestedIf {
    public static void main(String[] args) {
        int a = 0;
        int b = 2;
        int c = 3;

        if (b > a) {
            if (c > b) {
                System.out.println("C is the biggest!");
                return;
            }
            System.out.println("b is gretter than a");
        } else {
            System.out.println("A is to small");
        }
    }
}
