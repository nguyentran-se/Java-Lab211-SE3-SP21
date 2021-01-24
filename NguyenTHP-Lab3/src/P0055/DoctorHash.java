package P0055;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DoctorHash {

    private HashMap<String, Doctor> hashMap = new HashMap<>();
    private Scanner sc = new Scanner(System.in);
    ValidateInput validateInput = new ValidateInput();

    public int menu() {
        System.out.println("1. Add Doctor.");
        System.out.println("2. Update Doctor.");
        System.out.println("3. Delete Doctor.");
        System.out.println("4. Search Doctor.");
        System.out.println("5. Exit.");
        System.out.print("Your choice: ");
        int choice = sc.nextInt();
        sc.nextLine();
        return choice;
    }

    public void handleAdd() {
        Doctor d = new Doctor();
        System.out.println("--------- Add Doctor ----------");
        System.out.print("Enter Code: ");
        d.setCode(validateInput.checkEmptyInput());
        System.out.print("Enter Name: ");
        d.setName(validateInput.checkEmptyInput());
        System.out.print("Enter Specialization: ");
        d.setSpecialization(validateInput.checkEmptyInput());
        System.out.print("Enter Availability: ");
        d.setAvailability(validateInput.checkInputInt());
        try {
            addDoctor(d);
            hashMap.put(d.getCode(), d);
            System.out.println("Doctor add successfully!");
        } catch (DoctorException ex) {
            System.out.println(ex.getMessage());
        }
        display();
    }

    public boolean addDoctor(Doctor d) throws DoctorException {
        if (d == null) {
            throw new DoctorException("Database does not exist!");
        }
        if (hashMap.containsKey(d.getCode())) {
            throw new DoctorException("Doctor code '" + d.getCode() + "' is duplicate!");
        }
        if (d.getCode().equals("")) {
            throw new DoctorException("Data does not exist!");
        }
        return true;
    }

    public void handleUpdate() {
        System.out.println("--------- Update Doctor ----------");
        if (hashMap.isEmpty()) {
            try {
                throw new DoctorException("Database does not exist!\n");
            } catch (DoctorException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.print("Enter code to modify: ");
            String codeModify = validateInput.checkEmptyInput();
            if (!hashMap.containsKey(codeModify)) {
                try {
                    throw new DoctorException("Doctor code doesn’t exist!\n");
                } catch (DoctorException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                System.out.print("Enter Name: ");
                hashMap.get(codeModify).setName(validateInput.checkEmptyInput());
                System.out.print("Enter Specialization: ");
                hashMap.get(codeModify).setSpecialization(validateInput.checkEmptyInput());
                System.out.print("Enter Availability: ");
                hashMap.get(codeModify).setAvailability(validateInput.checkInputInt());
            }
        }
        display();
    }

    public void handleDelete() {
        System.out.println("--------- Delete Doctor ----------");
        if (hashMap.isEmpty()) {
            try {
                throw new DoctorException("Database does not exist!\n");
            } catch (DoctorException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.print("Enter code to delete: ");
            String codeDelete = validateInput.checkEmptyInput();
            if (!hashMap.containsKey(codeDelete)) {
                try {
                    throw new DoctorException("Doctor code doesn’t exist!\n");
                } catch (DoctorException ex) {
                    System.out.println(ex.getMessage());
                }
            } else {
                hashMap.remove(codeDelete);
            }
        }
        display();
    }

    public void handleSearch() {
        System.out.println("--------- Search Doctor ----------");
        if (hashMap.isEmpty()) {
            try {
                throw new DoctorException("Database does not exist!\n");
            } catch (DoctorException ex) {
                System.out.println(ex.getMessage());
            }
        } else {
            System.out.print("Enter name to search: ");
            String nameSearch = validateInput.checkEmptyInput();
            System.out.println("--------- Result ------------");
            System.out.printf("%s\t%s\t%s\t%s\n", "Code", "Name", "Specialization", "Availability");
            ArrayList<Doctor> doctorList = new ArrayList<>(hashMap.values());
            boolean check = false;
            for (Doctor doctor : doctorList) {
                if (nameSearch.equalsIgnoreCase(doctor.getName())) {
                    System.out.printf("%s\t%s\t%s\t%6d\n", doctor.getCode(), doctor.getName(),
                            doctor.getSpecialization(), doctor.getAvailability());
                    check = true;
                }
            }
            if(!check) System.out.println("Not found!");
            System.out.println("");
        }
    }

    public void display() {
        System.out.println("Your doctor list now:");
        Collection doctorList = hashMap.values();
        Iterator itr = doctorList.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
        System.out.println("");

    }

}
