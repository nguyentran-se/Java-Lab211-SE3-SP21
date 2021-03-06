package P0052.Control;

import P0052.Model.EastAsiaCountries;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ManageEastAsiaCountries {

    Scanner sc = new Scanner(System.in);
    ArrayList<EastAsiaCountries> list = new ArrayList<>();
    Validate validate = new Validate();

    public int menu() {
        System.out.println("================================ MENU ================================");
        System.out.println("1. Input the information of 11 countries in East Asia");
        System.out.println("2. Display the information of country you've just input");
        System.out.println("3. Search the information of country by user-entered name");
        System.out.println("4. Display the information of countries sorted name in ascending order");
        System.out.println("5. Exit");
        System.out.print("Your choice: ");
        return validate.checkInputChoice();
    }

    public void inputCountry() {
        System.out.println("Enter code of country: ");
        String code = validate.checkInputString();
        System.out.println("Enter name of country: ");
        String name = validate.checkInputString();
        System.out.println("Enter total Area: ");
        float totalArea = validate.checkInputFloat();
        System.out.println("Enter terrain of country: ");
        String terrain = validate.checkInputString();
        list.add(new EastAsiaCountries(code, name, totalArea, terrain));
        System.out.println("ADD SUCCESSFULLY!\n");
    }

    public void displayCountries() {
        System.out.printf("%s\t%s\t\t%s\t\t%s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries eastAsiaCountries : list) {
            System.out.println(eastAsiaCountries.display());
        }
        System.out.println("");
    }

    public void searchCountryByName() {
        System.out.println("Enter the name you want to search for:");
        String keySearch = validate.checkInputString();
        boolean flag = false;
        System.out.printf("%s\t%s\t\t%s\t\t%s\n", "ID", "Name", "Total Area", "Terrain");
        for (EastAsiaCountries e : list) {
            if (e.getCountryName().equalsIgnoreCase(keySearch)) {
                System.out.println(e.display());
                flag = true;
                break;
            }
        }
        if (!flag) {
            System.out.println("NOT FOUND!");
        }
        System.out.println("");
    }

    public void sortAscByName() {
        Collections.sort(list);
        displayCountries();
    }

    public void closeStreamManage() {
        sc.close();
        validate.closeStreamValidate();
    }
}
