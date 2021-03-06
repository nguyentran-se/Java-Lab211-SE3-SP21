package P0054.Control;

import P0054.View.Main;
import java.util.Scanner;

public class ValidateData {

    Scanner scanner = Main.sc;

    public String checkInputString() {
        while (true) {
            String value = scanner.nextLine();
            if (value.isEmpty()) {
                System.out.print("Invalid! Enter again: ");
            } else {
                return value;
            }
        }
    }

    public String checkInputPhone() {
        String regex = "(\\d{3}[.| |]\\d{3}[.| |]\\d{4})|(\\d{10})|(\\d{3}-\\d{3}-\\d{4}(( x1234)?|( ext1234)?))";
        while (true) {
            String value = scanner.nextLine();
            if (value.matches(regex)) {
                System.out.println("Successful!\n");
                return value;
            } else {
                System.out.println("Please input Phone flow");
                System.out.println("1234567890");
                System.out.println("123-456-7890");
                System.out.println("123-456-7890 x1234");
                System.out.println("123-456-7890 ext1234");
                System.out.println("123.456.7890");
                System.out.println("123 456 7890");
                System.out.print("Enter Phone: ");
            }
        }
    }

    public int checkInputChoice() {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                if (value > 4 || value < 1) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.out.print("Invalid! Choose again: ");
            }
        }
    }

    public int checkInputInt() {
        while (true) {
            try {
                int value = Integer.parseInt(scanner.nextLine().trim());
                return value;
            } catch (NumberFormatException e) {
                System.out.println("ID is digit");
                System.out.print("Enter ID: ");
            }
        }
    }
}
