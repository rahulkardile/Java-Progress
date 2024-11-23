package Sorting;

public class BubbleSort {

    public static void main(String[] args) {

        int arr[] = { 21, 43, 53, 64, 98, 3, 6, 0 };

        // bubble sort
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j + 1] = temp; 
                }
            }
        }

        for(int i = 1; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
