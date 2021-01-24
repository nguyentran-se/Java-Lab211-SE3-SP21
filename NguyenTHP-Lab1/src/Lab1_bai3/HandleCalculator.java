package Lab1_bai3;

import java.util.Scanner;

public class HandleCalculator {

    private Scanner sc = new Scanner(System.in);

    //menu
    public int mennu() {
        System.out.println("========= Calculator Program =========");
        System.out.println("1. Normal Calculator");
        System.out.println("2. BMI Calculator");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    //Check input number
    public double checkInputNumber() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine());
                return result;
            } catch (NumberFormatException e) {
                System.out.println("BMI is digit");
                System.out.print("Enter again: ");
            }
            
        }
    }

    //Check operator
    public String checkOperator() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.println("Not empty");
            } else if (result.equalsIgnoreCase("+") || result.equalsIgnoreCase("-")
                    || result.equalsIgnoreCase("*") || result.equalsIgnoreCase("/")
                    || result.equalsIgnoreCase("^") || result.equalsIgnoreCase("=")) {
                return result;
            } else {
                System.out.println("Please input (+, -, *, /, ^)");
            }
            System.out.print("Enter Operator: ");
        }
    }

    //input number
    public double inputNumber() {
        System.out.print("Enter number: ");
        double number = checkInputNumber();
        return number;
    }

    //calculator normal
    public void normalCalculator() {
        double memory;
        System.out.println("----- Normal Calculator -----");
        System.out.print("Enter number: ");
        memory = checkInputNumber();
        while (true) {
            System.out.print("Enter Operator: ");
            String operator = checkOperator();
            if (operator.equalsIgnoreCase("+")) {
                memory += inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("-")) {
                memory -= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("*")) {
                memory *= inputNumber();
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("/")) {
                double temp = inputNumber();
                if(temp == 0) {
                    System.out.println("Can not divide by zero!");
                    break;
                }
                memory /= temp;
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("^")) {
                memory = Math.pow(memory, inputNumber());
                System.out.println("Memory: " + memory);
            }
            if (operator.equalsIgnoreCase("=")) {
                System.out.println("Result: " + memory);
                System.out.println();
                return;
            }
        }
    }

    //display result BMI status
    public String BMIStatus(double bmi) {
        if (bmi < 19) {
            return "UNDER-STANDARD";
        } else if (bmi >= 19 && bmi < 25) {
            return "STANDARD";
        } else if (bmi >= 25 && bmi < 30) {
            return "OVERWEIGHT";
        } else if (bmi >= 30 && bmi < 40) {
            return "FAT - SHOULD LOSE WEIGHT";
        } else {
            return "VERY FAT - SHOULD LOSE WEIGHT IMMEDIATELY";
        }
    }

    //BMI calculator
    public void BMICalculator() {
        System.out.print("Enter Weight(kg): ");
        double weight = checkInputNumber();
        while(weight <= 0){
            System.out.print("Enter again, must > 0: ");
            weight = checkInputNumber();
        }
        System.out.print("Enter Height(cm): ");
        double height = checkInputNumber();
        while(height <= 0){
            System.out.print("Enter again, must > 0: ");
            height = checkInputNumber();
        }
        double bmi = weight*10000 / (height*height);
        System.out.printf("BMI number: %.2f\n", bmi);
        System.out.println("BMI Status: " + BMIStatus(bmi));
        System.out.println();
    }
}
