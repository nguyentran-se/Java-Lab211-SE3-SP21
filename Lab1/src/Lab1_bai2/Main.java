package Lab1_bai2;

public class Main {
    public static void main(String[] args) {
        HandleEquation handleEquation = new HandleEquation();
        while (true) {
            int choice = handleEquation.menu();
            switch (choice) {
                case 1:
                    handleEquation.calculateEquation();
                    break;
                case 2:
                    handleEquation.calculateQuadraticEquation();
                    break;
                default:
                    return;
            }
        }
    }
}
