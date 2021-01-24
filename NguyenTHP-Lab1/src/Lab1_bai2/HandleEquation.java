package Lab1_bai2;

import java.util.Scanner;

public class HandleEquation {

    private Scanner sc = new Scanner(System.in);

    //menu
    public int menu() {
        System.out.println("1. Calculate Superlative Equation");
        System.out.println("2. Calculate Quadratic Equation");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    //Handle user input
    public float handleInputNumber() {
        while (true) {
            try {
                float input = Float.parseFloat(sc.nextLine());
                return input;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    //Check number is odd or not
    public boolean isOdd(float n) {
        if (n % 2 == 1) {
            return true;
        } else {
            return false;
        }
    }

    //Check number is even or not
    public boolean isEven(float n) {
        if (n % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //Check number is perfect number or not
    public boolean isPerfectSquare(float n) {
        if ((int) Math.sqrt(n) * (int) Math.sqrt(n) == n) {
            return true;
        } else {
            return false;
        }
    }

    //Calculate Superlative Equation
    public void calculateEquation() {
        System.out.print("Enter A: ");
        float a = handleInputNumber();
        System.out.print("Enter B: ");
        float b = handleInputNumber();
        float x = -b / a;
        System.out.println("Solution: x = " + x);
        System.out.print("Number is odd: ");
        if (isOdd(a)) {
            System.out.print(a + " ");
        }
        if (isOdd(b)) {
            System.out.print(b + " ");
        }
        if (isOdd(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (isEven(a)) {
            System.out.print(a + " ");
        }
        if (isEven(b)) {
            System.out.print(b + " ");
        }
        if (isEven(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (isPerfectSquare(a)) {
            System.out.print(a + " ");
        }
        if (isPerfectSquare(b)) {
            System.out.print(b + " ");
        }
        if (isPerfectSquare(x)) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    //Calculate Quadratic Equation
    public void calculateQuadraticEquation() {
        System.out.print("Enter A: ");
        float a = handleInputNumber();
        System.out.print("Enter B: ");
        float b = handleInputNumber();
        System.out.print("Enter C: ");
        float c = handleInputNumber();
        float delta = b * b - 4 * a * c;
        float x1 = (float) ((-b + Math.sqrt(delta)) / (2 * a));
        float x2 = (float) ((-b - Math.sqrt(delta)) / (2 * a));
        System.out.println("Solution: x1 = " + x1 + " and x2 = " + x2);
        System.out.print("Number is odd: ");
        if (isOdd(a)) {
            System.out.print(a + " ");
        }
        if (isOdd(b)) {
            System.out.print(b + " ");
        }
        if (isOdd(c)) {
            System.out.print(c + " ");
        }
        if (isOdd(x1)) {
            System.out.print(x1 + " ");
        }
        if (isOdd(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
        System.out.print("Number is even: ");
        if (isEven(a)) {
            System.out.print(a + " ");
        }
        if (isEven(b)) {
            System.out.print(b + " ");
        }
        if (isEven(c)) {
            System.out.print(b + " ");
        }
        if (isEven(x1)) {
            System.out.print(x1 + " ");
        }
        if (isEven(x2)) {
            System.out.print(x1 + " ");
        }
        System.out.println();
        System.out.print("Number is perfect square: ");
        if (isPerfectSquare(a)) {
            System.out.print(a + " ");
        }
        if (isPerfectSquare(b)) {
            System.out.print(b + " ");
        }
        if (isPerfectSquare(c)) {
            System.out.print(c + " ");
        }
        if (isPerfectSquare(x1)) {
            System.out.print(x1 + " ");
        }
        if (isPerfectSquare(x2)) {
            System.out.print(x2 + " ");
        }
        System.out.println();
    }
}
