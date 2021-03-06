package P0054.View;

import P0054.Control.HandleContact;
import java.util.Scanner;

public class Main {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        HandleContact handleContact = new HandleContact();
        while (true) {
            int choice = handleContact.menu();
            switch (choice) {
                case 1:
                    handleContact.addContact();
                    break;
                case 2:
                    handleContact.displayAll();
                    break;
                case 3:
                    handleContact.deleteContact();
                    break;
                case 4:
                    sc.close();
                    return;
            }
        }
    }
}
