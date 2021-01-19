package Lab2_4Bai;

import java.util.Arrays;

public class LinearSearch {

    public void linearSearch(int[] arr, int keySearch) {
        System.out.println("The array: " + Arrays.toString(arr));
        int length = arr.length;
        boolean check = false;
        for (int i = 0; i < length; i++) {
            if (arr[i] == keySearch) {
                System.out.println("Found " + keySearch + " at index: " + i);
                System.out.println("");
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Not found!");
            System.out.println("");
        }
    }
}
