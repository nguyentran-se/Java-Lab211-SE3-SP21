package P0081;

public class Main {

    public static void main(String[] args) {
        HandleBee handleBee = new HandleBee();
        while (true) {
            int choice = handleBee.menu();
            switch (choice) {
                case 1:
                    handleBee.createBeeList();
                    break;
                case 2:
                    handleBee.attackBee();
                    break;
                case 3:
                    return;
                default:
                    break;
            }
        }
    }
}
