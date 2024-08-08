package Basics;

public class Ternary {
    public static void main(String[] args) {
        
        int a = 1;
        int b = 6;
        int c = 5;

    //    int max = a > b ? a : b;

    int max = a > b ? a > c ? a : c : b > c ? b : c;

       System.out.println(max);
    }
}
