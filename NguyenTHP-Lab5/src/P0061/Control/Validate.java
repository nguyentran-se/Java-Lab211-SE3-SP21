package P0061.Control;

import java.util.Scanner;

public class Validate {
    
    public static double checkDouble() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                double res = Double.parseDouble(sc.nextLine().trim());
                if (res < 0) {
                    throw new NumberFormatException();
                }
                return res;
            } catch (NumberFormatException e) {
                System.out.print("Invalid!, enter again: ");
            }
        }
    }
    
}
