package Sorting;

public class BubbleSort2 {
    public static void main(String[] args) {
        int arr[] = { 3, 232, 54, 53, 63, 61, 75 };

        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - 1 - i; j++){
                if(arr[j] > arr[j+1]){
                    
                    int temp = arr[j]; // big element
                    arr[j] = arr[j + 1]; 
                    arr[j + 1] = temp;

                }
            }
        }

        for(int i = 0; i < arr.length - 1; i++){
            System.out.println(arr[i]);
        }

    }
}
