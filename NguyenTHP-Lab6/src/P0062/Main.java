package P0062;

import java.util.Scanner;

public class Main {
    public Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HandleAnalyzePath hap = new HandleAnalyzePath();
        hap.show();
        new Main().scanner.close();
    }
}
