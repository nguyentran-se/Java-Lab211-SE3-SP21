package P0062;

import java.util.Scanner;

public class Validate {

    Scanner sc = new Main().scanner;

    public String chekInputPath() {
        //Tạo regex check path của file và folder
        String regex = "(\\w*:(\\\\||/))?(\\w+\\ *(\\\\||/))*(\\w+\\.\\w+){1}";
        while (true) {
            String value = sc.nextLine().trim();
            if (value.matches(regex)) {
                return value;
            } else {
                System.out.println("Invalid path!");
                System.out.print("Enter path again: ");
            }
        }
    }
}
