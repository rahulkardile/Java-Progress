package Basics;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {

        Scanner Sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = Sc.nextInt();

        System.out.println("Your age is : " + age);

        Sc.close();

    }
}
