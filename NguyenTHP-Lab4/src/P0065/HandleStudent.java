package P0065;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HandleStudent {

    Scanner sc = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();

    public void createStudent() {
        System.out.println("====== Management Student Program ======");
        do {
            System.out.print("Name: ");
            String name = checkEmptyInput();
            System.out.print("Classes: ");
            String className = checkEmptyInput();
            System.out.print("Maths: ");
            double maths = checkMarkInput("Maths");
            System.out.print("Chemistry: ");
            double chemistry = checkMarkInput("Chemistry");
            System.out.print("Physics: ");
            double physics = checkMarkInput("Physics");
            double average = (maths + chemistry + physics) / 3;
            char type;
            if (average > 7.5) {
                type = 'A';
            } else if (average >= 6 && average <= 7.5) {
                type = 'B';
            } else if (average >= 4 && average < 6) {
                type = 'C';
            } else {
                type = 'D';
            }
            list.add(new Student(name, className, maths, physics, chemistry, average, type));
            System.out.print("Do you want to enter more student information?(Y/N): ");
        } while (isContinue());
    }

    public void showInfoStudent() {
        int i = 0;
        for (Student student : list) {
            System.out.println("------Student" + (++i) + " Info------");
            System.out.println("Name: " + student.getName());
            System.out.println("Classes: " + student.getClasses());
            System.out.println("AVG: " + student.getAverage());
            System.out.println("Type: " + student.getType());
            System.out.println("");
        }
    }

    public void getPercentTypeStudent() {
        HashMap<String, Double> statisOfType = new HashMap<>();
        double countA = 0;
        double countB = 0;
        double countC = 0;
        double countD = 0;
        for (Student student : list) {
            if (student.getType() == 'A') {
                countA++;
            }
            if (student.getType() == 'B') {
                countB++;
            }
            if (student.getType() == 'C') {
                countC++;
            }
            if (student.getType() == 'D') {
                countD++;
            }
        }
        int totalStudent = list.size();
        statisOfType.put("A", countA / totalStudent * 100);
        statisOfType.put("B", countB / totalStudent * 100);
        statisOfType.put("C", countC / totalStudent * 100);
        statisOfType.put("D", countD / totalStudent * 100);
        System.out.println("--------Classification Info--------");
        for (Map.Entry student : statisOfType.entrySet()) {
            System.out.println(student.getKey() + ": " + student.getValue() + "%");
        }
    }

    public String checkEmptyInput() {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty()) {
                System.out.print("Not empty, enter again: ");
            } else {
                return result;
            }
        }
    }

    public double checkMarkInput(String subject) {
        while (true) {
            try {
                String temp = sc.nextLine();
                if (temp.isEmpty() || !isNumeric(temp)) {
                    throw new Exception(subject + " is digit");
                }
                double result = Double.parseDouble(temp);
                if (result > 10) {
                    throw new Exception(subject + " is less than equal ten");
                }
                if (result < 0) {
                    throw new Exception(subject + " is greater than equal zero");
                }
                return result;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.print(subject + ": ");
            }
        }
    }

    public boolean isContinue() {
        while (true) {
            String result = sc.nextLine();
            if (result.length() == 1) {
                if (result.equalsIgnoreCase("y")) {
                    return true;
                }
                if (result.equalsIgnoreCase("n")) {
                    return false;
                }
            }
            System.out.print("Invalid, enter again: ");
        }
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
