package P0056;

public class Main {

    public static void main(String[] args) {
        HandleWorker handleWorker = new HandleWorker();
        while (true) {
            int choice = handleWorker.menu();
            switch (choice) {
                case 1:
                    handleWorker.addWorker();
                    break;
                case 2:
                    handleWorker.upSalary();
                    break;
                case 3:
                    handleWorker.downSalary();
                    break;
                case 4:
                    handleWorker.getInfomationSalary();
                    break;
                case 5: 
                    return;
                default:
                    break;
            }
        }
    }
}
