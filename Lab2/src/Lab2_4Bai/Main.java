package Lab2_4Bai;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Main method = new Main();
        int n = method.inputLength();
        int[] arr = new int[n];
        arr = method.generateRandomArray(n);
        int[] arrCopy = Arrays.copyOf(arr, n);

//        Bubble Sort
        System.out.println("--Bubble Sort--");
        method.display(arr);
        BubbleSort bs = new BubbleSort();
        bs.bubbleSort(arrCopy);

//        Quick Sort
        System.out.println("--Quick Sort--");
        method.display(arr);
        arrCopy = Arrays.copyOf(arr, n);
        QuickSort qs = new QuickSort();
        qs.quickSort(arrCopy, 0, n - 1);
        qs.displayResult(arrCopy);

//        Linear Search
        System.out.println("--Linear Search--");
        System.out.println("Enter search value:");
        int keyLinearSearch = sc.nextInt();
        LinearSearch ls = new LinearSearch();
        ls.linearSearch(arr, keyLinearSearch);
        
//        Binary Search
        System.out.println("--Binary Search--");
        System.out.println("Enter search value:");
        int keyBinarySearch = sc.nextInt();
        BinarySearch bins = new BinarySearch();
        bins.handleBinarySearch(arr, keyBinarySearch);
    }

    public int inputLength() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array's element:");
        return sc.nextInt();
    }

    public int[] generateRandomArray(int n) {
        Random rand = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = rand.nextInt(2 * n) + 1;
        }
        return arr;
    }

    public void display(int[] arr) {
        System.out.println("Unsorted array: " + Arrays.toString(arr));
    }
}
