package P0067;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnalyzeString {

    Scanner sc = new Scanner(System.in);

    public void result() {
        System.out.println("===== Analysis String program ====");
        System.out.print("Input String: ");
        String input = checkInputString();
//        String input = "321sdhkjDFGH!@#$%^22fd22sf3";
        System.out.println("-----Result Analysis------");
        getNumber(input);
        getCharacter(input);
        sc.close();
    }

    public void getNumber(String input) {
        HashMap<String, ArrayList<Integer>> classifyNumber = new HashMap<>();
        ArrayList<Integer> allOfNumber = new ArrayList<>();
        ArrayList<Integer> evenNumber = new ArrayList<>();
        ArrayList<Integer> oddNumber = new ArrayList<>();
        ArrayList<Integer> squareNumber = new ArrayList<>();
        int length = input.split("\\D").length;
        for (int i = 0; i < length; i++) {
            String tmp = input.split("\\D")[i];
            if (!tmp.equals("") && !allOfNumber.contains(Integer.parseInt(tmp))) {
                allOfNumber.add(Integer.parseInt(tmp));
            }
        }
        for (Integer integer : allOfNumber) {
            if (integer % 2 == 0) {
                evenNumber.add(integer);
            } else if (integer % 2 != 0) {
                oddNumber.add(integer);
            } else if (Math.floor(Math.sqrt(integer)) == Math.sqrt(integer)) {
                squareNumber.add(integer);
            }
        }
        classifyNumber.put("Perfect Square Numbers", squareNumber);
        classifyNumber.put("Odd Numbers", oddNumber);
        classifyNumber.put("Even Numbers", evenNumber);
        classifyNumber.put("All Numbers", allOfNumber);
        for (Map.Entry<String, ArrayList<Integer>> entry : classifyNumber.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        System.out.println("");
    }

    public void getCharacter(String input) {
        HashMap<String, String> classifyCharacter = new HashMap<>();
        String uppercase = input.replaceAll("\\W|[0-9]|[a-z]", "");
        String lowercase = input.replaceAll("\\W|[0-9]|[A-Z]", "");
        String special = input.replaceAll("\\w", "");
        String allCharacter = input.replaceAll("\\d", "");
        classifyCharacter.put("Uppercase Characters", uppercase);
        classifyCharacter.put("Lowercase Characters", lowercase);
        classifyCharacter.put("Special Characters", special);
        classifyCharacter.put("All Characters", allCharacter);
        for (Map.Entry<String, String> entry : classifyCharacter.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }

    public String checkInputString() {
        while (true) {
            String value = sc.nextLine();
            if (value.isEmpty()) {
                System.out.print("Invalid! Enter again: ");
            } else {
                return value;
            }
        }
    }
}
