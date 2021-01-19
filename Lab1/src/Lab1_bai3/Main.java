package Lab1_bai3;

public class Main {

    public static void main(String[] args) {
        HandleCalculator handleCalculator = new HandleCalculator();
        while (true) {
            int choice = handleCalculator.mennu();
            switch (choice) {
                case 1:
                    handleCalculator.normalCalculator();
                    break;
                case 2:
                    handleCalculator.BMICalculator();
                    break;
                default:
                    return;
            }
        }

    }
}
