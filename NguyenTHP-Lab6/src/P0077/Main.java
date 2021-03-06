package P0077;

import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HandleFile handleFile = new HandleFile();
        while (true) {
            int choice = handleFile.menu();
            switch (choice) {
                case 1:
                    handleFile.countWordInFile();
                    break;
                case 2:
                    handleFile.getFileNameContainsWordInDirectory();
                    break;
                case 3:
                    new Main().scanner.close();
                    return;
            }
        }
    }
}
