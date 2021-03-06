package P0058;

import java.util.Scanner;

public class Validate {

    Scanner sc = new Main().scanner;
    public int checkInputChoice() {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine().trim());
                if (value > 4 || value < 1) {
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
            String value = sc.nextLine().trim();
            if (value.isEmpty()) {
                System.out.print("Invalid! Enter again: ");
            } else {
                return value;
            }
        }
    }
}
