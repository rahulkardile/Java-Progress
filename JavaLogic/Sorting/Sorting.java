package Sorting;

public class Sorting {

    // bubble sorting algo done
    public static int[] bubble(int[] arr){

        for (int i = 0; i < arr.length - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
    
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                } 
    
            }
        }

        return arr;
    } 

    public static void main(String[] args) {
        
        int arr[] = {7, 8, 3, 1, 2};

        int bubble[] = bubble(arr);

        for (int i = 0; i < bubble.length; i++) {
            System.out.print(bubble[i]);
            System.out.print("\t");
        }

    }
}