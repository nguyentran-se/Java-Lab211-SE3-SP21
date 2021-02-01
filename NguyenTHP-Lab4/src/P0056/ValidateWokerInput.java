package P0056;

import java.util.ArrayList;
import java.util.Scanner;

public class ValidateWokerInput {

    private Scanner sc = new Scanner(System.in);

    public String checkCodeInput(ArrayList<Worker> list) {
        while (true) {
            String result = sc.nextLine().trim();
            if (result.isEmpty() || isCodeExist(list, result)) {
                System.out.print("Invalid or duplicated, enter again: ");
            } else {
                return result;
            }
        }
    }

    public boolean isCodeExist(ArrayList<Worker> list, String code) {
        for (Worker worker : list) {
            if(worker.getCode().equalsIgnoreCase(code)) return true;
        }
        return false;
    }

    public int checkAgeInput() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                if (result < 18 || result > 50) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Must be in 18 to 50, enter again: ");
            }
        }
    }

    public double checkPositiveInput() {
        while (true) {
            try {
                double result = Double.parseDouble(sc.nextLine().trim());
                if (result <= 0) {
                    throw new NumberFormatException();
                }
                return result;
            } catch (NumberFormatException e) {
                System.out.print("Must be > 0, enter again: ");
            }
        }
    }
}
