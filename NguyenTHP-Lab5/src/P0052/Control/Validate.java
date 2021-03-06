package P0052.Control;

import java.util.Scanner;

public class Validate {

    Scanner sc = new Scanner(System.in);

    public int checkInputChoice() {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine().trim());
                if (value > 5 || value < 1) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid! Choose again: ");
            }
        }
    }

    public String checkInputString() {
        while (true) {
            String value = sc.nextLine();
            if (value.isEmpty()) {
                System.out.print("Invalid! Enter again: ");
            } else {
                return value;
            }
        }
    }

    public float checkInputFloat() {
        while (true) {
            try {
                float value = Float.parseFloat(sc.nextLine().trim());
                if (value <= 0) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid number! Enter again: ");
            }
        }
    }

    public void closeStreamValidate() {
        sc.close();
    }
}
