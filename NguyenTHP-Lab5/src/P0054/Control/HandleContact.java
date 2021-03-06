package P0054.Control;

import P0054.Model.ContactData;
import P0054.View.Main;
import java.util.ArrayList;
import java.util.Scanner;

public class HandleContact {

    Scanner scanner = Main.sc;
    ValidateData validate = new ValidateData();
    private ArrayList<ContactData> listContact = new ArrayList<>();

    public int menu() {
        System.out.println("========= Contact program =========");
        System.out.println("1. Add a contact");
        System.out.println("2. Display a contact");
        System.out.println("3. Delete a contatct");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
        return validate.checkInputChoice();
    }

    public void addContact() {
        System.out.println("-------- Add a Contact --------");
        System.out.print("Enter First Name: ");
        String firstName = validate.checkInputString();
        System.out.print("Enter Last Name: ");
        String lastName = validate.checkInputString();
        System.out.print("Enter Group: ");
        String group = validate.checkInputString();
        System.out.print("Enter Address: ");
        String address = validate.checkInputString();
        System.out.print("Enter Phone: ");
        String phone = validate.checkInputPhone();
        String fullName = firstName + " " + lastName;
        ContactData contactData = new ContactData(fullName, group, address, phone, lastName, firstName);
        listContact.add(contactData);
    }

    public void displayAll() {
        System.out.println("--------------------------------- Display all Contact ----------------------------");
        System.out.printf("%s\t%s\t\t%s\t%s\t%s\t%s\t%s\n", "ID", "Name", "First Name", "Last Name", "Group", "Address", "Phone");
        for (ContactData contactData : listContact) {
            System.out.println(contactData.toString());
        }
        System.out.println("");
    }

    public void deleteContact() {
        System.out.println("------- Delete a Contact -------");
        System.out.print("Enter ID: ");
        int keySearch = validate.checkInputInt();
        boolean flag = false;
        for (ContactData contactData : listContact) {
            if (keySearch == contactData.getId()) {
                listContact.remove(contactData);
                flag = true;
                break;
            }
        }
        if (flag) {
            System.out.println("Successful!");
        } else {
            System.out.println("No found contact!");
        }
        System.out.println("");
    }
}
