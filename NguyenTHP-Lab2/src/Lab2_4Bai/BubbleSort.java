package Lab2_4Bai;

import java.util.Arrays;

public class BubbleSort {
    public void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.println("");
    }
    
    
}
