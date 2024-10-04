package JavaLogic.Basics;

import java.util.Scanner;

public class Fibunatchi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int i, n1 = 0, n2 = 1, n3;

        for (i = 2; i < a; i++) {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }

}
