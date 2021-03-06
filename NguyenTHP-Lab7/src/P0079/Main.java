package P0079;

import java.util.Scanner;

public class Main {

    public Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        HandleZipper handleZipper = new HandleZipper();
        while (true) {
            int choice = handleZipper.menu();
            switch (choice) {
                case 1:
                    handleZipper.compressTo();
                    break;
                case 2:
                    handleZipper.extractTo();
                    break;
                case 3:
                    new Main().scanner.close();
                    return;
            }
        }
    }

}
