package Basics;

import java.util.Scanner;

public class ForLoop2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter A Number!");
        int userNum = scan.nextInt();
        System.out.println("\n");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i * userNum);
        }

        scan.close();

    }

}
