package Sorting;

import java.util.ArrayList;
import java.util.Arrays;

public class Sorting {

    // bubble sorting algo done
    public static int[] bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {

                if (arr[j] > arr[j + 1]) {

                    // int temp = arr[j];
                    // arr[j] = arr[j + 1];
                    // arr[j + 1] = temp;

                    arr[j] = arr[j] + arr[j + 1];
                    arr[j + 1] = arr[j] - arr[j + 1];
                    arr[j] = arr[j] - arr[j + 1];
                }
            }
        }
        return arr;
    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            System.out.print("\t");
        }
    }

    public static void main(String[] args) {

        int arr[] = { 7, 8, 3, 1, 2 };

        ArrayList<Integer> arr3 = new ArrayList<>(Arrays.asList(7, 8, 3, 1, 2));

        arr3.sort(null);
        System.out.println("list : " + arr3);

        System.out.println("length : " + arr.length);

        int bubble[] = bubble(arr);

    }
}