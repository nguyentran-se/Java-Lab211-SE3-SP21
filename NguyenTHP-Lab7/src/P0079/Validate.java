package P0079;

import java.util.Scanner;

public class Validate {

    Scanner sc = new Main().scanner;

    public int checkInputChoice() {
        while (true) {
            try {
                int value = Integer.parseInt(sc.nextLine().trim());
                    if (value > 3 || value < 1) {
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

    public String chekInputPath(String kindOfPath) {
        //Tạo regex check path của file và folder
        String regex = "(\\w*:(\\\\||/))?(\\w+\\ *(\\\\||/))*(\\w+\\.\\w+){1}";
        if (kindOfPath.equals("folder")) {
            regex = "(\\w*:(\\\\||/))?(\\w+\\ *(\\\\||/))*";
        }
        while (true) {
            String value = sc.nextLine();
            if (value.matches(regex)) {
                return value;
            } else {
                System.out.println("Invalid path!");
                System.out.print("Enter path again: ");
            }
        }
    }
}
