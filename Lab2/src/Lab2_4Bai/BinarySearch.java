package Lab2_4Bai;

import java.util.Arrays;

public class BinarySearch {
    public void handleBinarySearch(int[] arr, int keySearch){
        QuickSort qs = new QuickSort();
        int length = arr.length;
        qs.quickSort(arr, 0, length - 1);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        int result = binarySearch(arr, keySearch, 0, length - 1);
        if(result != -1)
        System.out.println("Found " + keySearch + " at index: " + result);
        else System.out.println("Not found!");
    }
    
    public int binarySearch(int[] array, int value, int left, int right){
        if (left > right) {
            return -1;
        }
        int middle = (left + right) / 2;
        if (array[middle] == value) {
            return middle;
        } else if (array[middle] > value) {
            return binarySearch(array, value, left, middle - 1);
        } else {
            return binarySearch(array, value, middle + 1, right);
        }
    }
}
