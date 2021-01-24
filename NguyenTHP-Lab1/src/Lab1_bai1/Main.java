package Lab1_bai1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your content: ");
        String content = sc.nextLine();
        HandleCounter hc = new HandleCounter();
        hc.countWord(content);
        hc.countChar(content);
        hc.displayResult();
    }
}
