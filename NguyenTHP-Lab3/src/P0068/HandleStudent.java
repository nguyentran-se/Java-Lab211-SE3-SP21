package P0068;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class HandleStudent {

    private Scanner sc = new Scanner(System.in);
    private ArrayList<Student> list = new ArrayList<>();

    public float checkFloatInput() {
        float n;
        try {
            n = Float.parseFloat(sc.nextLine().trim());
            if (n < 0) {
                throw new NumberFormatException();
            }
            return n;
        } catch (NumberFormatException e) {
            System.out.println("Invalid data!");
            return -1;
        }
    }

    public void inputStudent() {
        char check;
        do {
            Student student = new Student();
            System.out.println("Please input student information");
            System.out.print("Name: ");
            student.setName(sc.nextLine());
            System.out.print("Classes: ");
            student.setClasses(sc.nextLine());
            System.out.print("Mark: ");
            student.setMark(checkFloatInput());
            System.out.print("Do you want to enter more student information?(Y/N): ");
            check = sc.nextLine().charAt(0);
            System.out.println("");
            if(student.getMark() != -1) list.add(student);
        } while (check != 'N' && check != 'n');
        sc.close();
    }

    public void sortStudent() {
        Collections.sort(list, new StudentComparator());
    }

    public void display() {
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println("-------------Student " + (i + 1) + " -------------");
            System.out.println("Name: " + s.getName());
            System.out.println("Classes: " + s.getClasses());
            System.out.println("Mark: " + s.getMark());
        }
    }
}
