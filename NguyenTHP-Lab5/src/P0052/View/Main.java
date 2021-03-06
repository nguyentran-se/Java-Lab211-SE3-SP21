package P0052.View;

import P0052.Control.ManageEastAsiaCountries;

public class Main {

    public static void main(String[] args) {
        ManageEastAsiaCountries m = new ManageEastAsiaCountries();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.inputCountry();
                    break;
                case 2:
                    m.displayCountries();
                    break;
                case 3:
                    m.searchCountryByName();
                    break;
                case 4:
                    m.sortAscByName();
                    break;
                case 5:
                    m.closeStreamManage();
                    return;
            }
        }
    }
}
