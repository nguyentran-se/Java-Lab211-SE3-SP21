package P0055;

public class Main {
    public static void main(String[] args) {
        DoctorHash doctorHash = new DoctorHash();
        while (true) {
            int choice = doctorHash.menu();
            switch (choice) {
                case 1:
                    doctorHash.handleAdd();
                    break;
                case 2:
                    doctorHash.handleUpdate();
                    break;
                case 3:
                    doctorHash.handleDelete();
                    break;
                case 4:
                    doctorHash.handleSearch();
                    break;
                case 5:
                    return;
                default:
                    break;
            }
        }
    }
}
