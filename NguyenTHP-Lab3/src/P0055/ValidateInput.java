package P0055;

import java.util.Scanner;

public class ValidateInput {

    private Scanner sc = new Scanner(System.in);

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

    public int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Invalid, enter again: ");
            }
        }
    }
}
