package P0063;

import java.util.Scanner;

public class HandlePerson {

    private Scanner sc = new Scanner(System.in);
    private final int SIZE = 3;
    Person[] persons = new Person[SIZE];

    public void inputThreePersons() throws Exception {
        System.out.println("=====Management Person programer=====");
        for (int i = 0; i < SIZE; i++) {
            persons[i] = inputPersonInfo();
        }
    }

    public Person inputPersonInfo() throws Exception {
        System.out.print("Please input name: ");
        String name = sc.nextLine();
        System.out.print("Please input address: ");
        String address = sc.nextLine();
        System.out.print("Please input salary: ");
        double salary = checkSalary();
        System.out.println("");
        return new Person(name, address, salary);
    }

    public void functiondisplayPersonInfo(Person[] persons) {
        for (int i = 0; i < SIZE; i++) {
            System.out.println("Information of Person you have entered:");
            System.out.println("Name: " + persons[i].getName());
            System.out.println("Address: " + persons[i].getAddress());
            System.out.println("Salary: " + persons[i].getSalary());
            System.out.println("");
        }
    }

    public Person[] sortBySalary(Person[] persons) throws Exception {
        if (persons == null || persons.length == 0) {
            throw new Exception("Can't sort person");
        }
        for (int i = 0; i < persons.length; i++) {
            for (int j = i + 1; j < persons.length; j++) {
                if (persons[j].getSalary() < persons[i].getSalary()) {
                    Person p = persons[i];
                    persons[i] = persons[j];
                    persons[j] = p;
                }
            }
        }
        return persons;
    }

    public double checkSalary() throws Exception {
        while (true) {
            try {
                String temp = sc.nextLine();
                if (temp.isEmpty()) {
                    throw new Exception("You must input Salary.");
                }
                if (!isNumeric(temp)) {
                    throw new Exception("You must input digit.");
                }
                double result = Double.parseDouble(temp);
                if (result < 0) {
                    throw new Exception("Salary is greater than zero.");
                }
                return result;
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
                System.out.print("Please input salary: ");
            }
        }
    }

    public boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
