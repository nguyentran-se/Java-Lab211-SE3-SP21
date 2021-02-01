package P0056;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.Scanner;

public class HandleWorker {

    private ArrayList<Worker> list = new ArrayList<>();
    private ArrayList<SalaryHistory> historyList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    ValidateWokerInput validate = new ValidateWokerInput();
    SalaryHistory history;

    public int menu() {
        System.out.println("====== Worker Management ======");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
        System.out.print("Choose an option: ");
        return sc.nextInt();
    }

    public void addWorker() {
        Worker w = new Worker();
        System.out.println("--------- Add Worker ---------");
        System.out.print("Enter Code: ");
        w.setCode(validate.checkCodeInput(list));
        sc.nextLine();
        System.out.print("Enter Name: ");
        w.setName(sc.nextLine());
        System.out.print("Enter Age: ");
        w.setAge(validate.checkAgeInput());
        System.out.print("Enter Salary: ");
        w.setSalary(validate.checkPositiveInput());
        System.out.print("Enter work location: ");
        w.setWorkLocation(sc.nextLine());
        list.add(w);
        display();
        System.out.println("");
    }

    public void upSalary() {
        sc.nextLine();
        System.out.println("--------- Up Salary ---------");
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        if (validate.isCodeExist(list, code)) {
            System.out.print("Enter salary: ");
            double up = validate.checkPositiveInput();
            for (Worker worker : list) {
                if (worker.getCode().equalsIgnoreCase(code)) {
                    double salary = up + worker.getSalary();
                    worker.setSalary(salary);
                    history = new SalaryHistory(worker.getCode(), worker.getName(), worker.getAge(),
                            worker.getSalary(), worker.getWorkLocation(), "UP", getDay());
                    historyList.add(history);
                    break;
                }
            }
        } else {
            System.out.println("Code does not exist in database!");
        }
        display();
        System.out.println("");
    }

    public void downSalary() {
        sc.nextLine();
        System.out.println("--------- Down Salary ---------");
        System.out.print("Enter Code: ");
        String code = sc.nextLine();
        if (validate.isCodeExist(list, code)) {
            System.out.print("Enter salary: ");
            double down = validate.checkPositiveInput();
            for (Worker worker : list) {
                if (worker.getCode().equalsIgnoreCase(code)) {
                    double salary = worker.getSalary() - down;
                    if (salary > 0) {
                        worker.setSalary(salary);
                        history = new SalaryHistory(worker.getCode(), worker.getName(), worker.getAge(),
                                worker.getSalary(), worker.getWorkLocation(), "DOWN", getDay());
                        historyList.add(history);
                    } else {
                        System.out.println("Invalid! Total salary must be > 0");
                    }
                    break;
                }
            }
        } else {
            System.out.println("Code does not exist in database!");
        }
        display();
        System.out.println("");
    }

    public void getInfomationSalary() {
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%s\t%s\t%s\t%s\t\t%s\t\t%s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
        Collections.sort(historyList);
        for (SalaryHistory his : historyList) {
            System.out.printf("%s\t%s\t%d\t%.0f\t\t%s\t\t%s\n", his.getCode(), his.getName(),
                    his.getAge(), his.getSalary(), his.getStatus(), his.getDate());
        }
        System.out.println("");
    }

    public String getDay() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Calendar calendar = Calendar.getInstance();
        return dateFormat.format(calendar.getTime());
    }

    public void display() {
        for (Worker worker : list) {
            System.out.println(worker);
        }
    }
}
