package Basics;

import java.util.Scanner;

public class Break_Continue {
    public static void main(String[] args) {

        int i = 0;
        do {
            if (i == 4)break;
            System.out.println("do has given toffie to " + i);
            i++;
        } while (i < 20);

        for(i = 0; i < 10; i++){
            if (i == 4)continue;
            System.out.println("Toffie give to " + i);
        }

    }
}