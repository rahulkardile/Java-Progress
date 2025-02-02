package Sorting;

public class Sorting {

    // 1. bubble sorting algo done
    // time complexity = O(n^2)
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

    // 2. selection sort
    public static int[] selection(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int smallestIndex = i;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallestIndex] < arr[j]) {
                    smallestIndex = j;
                }
            }
            int temp = arr[smallestIndex];
            arr[smallestIndex] = arr[i];
            arr[i] = temp;
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
        printArr(selection(arr));
    }
}