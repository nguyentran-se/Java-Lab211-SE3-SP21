package Lab1_bai4;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.print("Enter first number: ");
        String firstNum = checkInput();
        System.out.print("Enter second number: ");
        String secondNum = checkInput();
        BigInteger bigFirstNum = new BigInteger(firstNum);
        BigInteger bigSecondNum = new BigInteger(secondNum);
        System.out.print("Result of multiple: ");
        System.out.println(bigFirstNum.multiply(bigSecondNum));
    }

    public static String checkInput() {
        Scanner sc = new Scanner(System.in);
        String pattern = "\\d+";
        while (true) {
            String input = sc.nextLine().trim();
            if (input.isEmpty() || !input.matches(pattern)) {
                System.out.println("Invalid!!!");
                System.out.print("Enter again: ");
                continue;
            }
            return input;
        }
    }

    
}
