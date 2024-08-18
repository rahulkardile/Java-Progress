import java.util.Scanner;

public class addTwo {

    public static int add(int a, int b) {
        return a + b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        System.out.println(add(a, b));

        int multi = multiply(a, b);

        System.out.println("Multiplication is : " + multi);
        sc.close();
    }
}
