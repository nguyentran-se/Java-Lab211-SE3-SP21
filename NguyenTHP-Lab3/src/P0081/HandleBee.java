package P0081;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HandleBee {

    private ArrayList<Bee> list;
    private Random random = new Random();
    private Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("====Bee====");
        System.out.println("1. Create new bee list.");
        System.out.println("2. Damage bee.");
        System.out.println("3. Quit.");
        System.out.print("Choose an option: ");
        int choice = checkIntInput();
        return choice;
    }

    public int checkIntInput() {
        int n = 0;
        try {
            n = Integer.parseInt(sc.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid!");
        }
        return n;
    }

    public void createBeeList() {
        int counter = 10;
        list = new ArrayList<>();
        while (counter >= 1) {
            Bee[] arrBee = {new Drone("DRONE"), new Worker("WORKER"), new Queen("QUEEN")};
            int randomBee = random.nextInt(3);
            Bee b = arrBee[randomBee];
            list.add(b);
            counter--;
        }
        showList();
    }

    public void attackBee() {
        for (int i = 0; i < 10; i++) {
            Bee b = list.get(i);
            float randomDame = random.nextFloat() * 80;
            b.dammage(randomDame);
            b.checkDead();
        }
        showList();
    }

    public void showList() {
        for (Bee bee : list) {
            System.out.println(bee.toString());
        }
        System.out.println("");
    }

}
