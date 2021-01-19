package Lab2_P0053;

import java.util.Scanner;

public class HandleBubbleSort {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
        System.out.print("Please choice one option: ");
        int n = sc.nextInt();
        sc.nextLine();
        return n;
    }

    public int checkInput() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                while (result <= 0) {
                    System.out.println("Please input number and number is greater than zero");
                    System.out.print("Enter number: ");
                    result = Integer.parseInt(sc.nextLine().trim());
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.println("Please input number and number is greater than zero");
                System.out.print("Enter number: ");
            }
        }
    }

    public int[] inputElements() {
        System.out.println("");
        System.out.println("----- Input Element -----");
        System.out.println("Input Length Of Array");
        System.out.print("Enter number: ");
        int n = checkInput();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Number " + (i + 1) + ": ");
            a[i] = sc.nextInt();
        }
        System.out.println("");
        return a;
    }
    
    public void sortAscending(int[] arr){
        System.out.println("----- Ascending -----");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print("[" + arr[i] + "]");
                break;
            }
            System.out.print("[" + arr[i] + "]->");
        }
        System.out.println("\n");
    }
    
    public void sortDescending(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.print("[" + arr[i] + "]");
                break;
            }
             System.out.print("[" + arr[i] + "]<-");
        }
        System.out.println("\n");
    }
}
