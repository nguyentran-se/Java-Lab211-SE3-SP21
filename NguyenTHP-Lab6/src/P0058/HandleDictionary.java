package P0058;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HandleDictionary {

    Validate validate = new Validate();
    HashMap<String, String> dictionary = new HashMap<>();
    Scanner sc = new Main().scanner;

    public int menu() {
        System.out.println("======== Dictionary program ========");
        System.out.println("1. Add new word");
        System.out.println("2. Delete word");
        System.out.println("3. Search word");
        System.out.println("4. Exit");
        System.out.print("Your choice: ");
        return validate.checkInputChoice();
    }

    public void addWord() {
        System.out.println("------------- Add -------------");
        System.out.print("Enter English: ");
        String keyEng = validate.checkInputString();
        if (dictionary.containsKey(keyEng) || dictionary.containsKey(keyEng.toLowerCase())) {
            System.out.print("Do you want to update, Y/N? Your choice: ");
            String choice = validate.checkInputString();
            if (choice.equalsIgnoreCase("y")) {
                System.out.println("Your update: ");
                String update = validate.checkInputString();
                dictionary.replace(keyEng, dictionary.get(keyEng), dictionary.get(keyEng) + " OR " + update);
                showDictionary();
                return;
            }else{
                System.out.println("This data will be overriden in dictionary!");
            }
        }
        System.out.print("Enter Vietnamese: ");
        String valueVn = validate.checkInputString();
        dictionary.put(keyEng, valueVn);
        System.out.println("Successful\n");
        showDictionary();
    }

    public void removeWord() {
        System.out.println("------------ Delete ----------------");
        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty! Can not do this option!");
        } else {
                System.out.print("Enter English: ");
            while (true) {
                String keyRemove = validate.checkInputString();
                if (!dictionary.containsKey(keyRemove) && !dictionary.containsKey(keyRemove.toLowerCase())) {
                    System.out.print("Key not exist! Enter key again: ");
                } else {
                    dictionary.remove(keyRemove);
                    System.out.println("Successsful");
                    break;
                }
            }
            showDictionary();
        }

        System.out.println("");
    }

    public void translate() {
        System.out.println("------------- Translate ------------");
        if (dictionary.isEmpty()) {
            System.out.println("Dictionary is empty! Can not do this option!");
        } else {
            System.out.print("Enter English: ");
            String keyTranslate = validate.checkInputString();
            if (dictionary.get(keyTranslate) != null) {
                System.out.println("Vietnamese: " + dictionary.get(keyTranslate));
            } else {
                System.out.println("This word is not exist in database!");
            }
        }
        System.out.println("");
    }

    public void showDictionary() {
        for (Map.Entry<String, String> entry : dictionary.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
