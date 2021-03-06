package P0058;

import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HandleDictionary handleDictionary = new HandleDictionary();
        while (true) {
            int choice = handleDictionary.menu();
            switch (choice) {
                case 1:
                    handleDictionary.addWord();
                    break;
                case 2:
                    handleDictionary.removeWord();
                    break;
                case 3:
                    handleDictionary.translate();
                    break;
                case 4:
                    new Main().scanner.close();
                    return;
            }
        }
    }
}
