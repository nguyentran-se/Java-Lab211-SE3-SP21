package P0077;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class HandleFile {

    Validate validate = new Validate();

    //Menu
    public int menu() {
        System.out.println("============ Word Program =========");
        System.out.println("1. Count Word In File");
        System.out.println("2. Find File By Word");
        System.out.println("3. Exit");
        System.out.print("Your choice: ");
        return validate.checkInputChoice();
    }

    //Đếm 1 từ trong file. Có sẵn file text.txt ở path mặc định để test!
    public void countWordInFile() {
        try {
            System.out.println("-------- Count Word --------");
            //Nhập path và key search
            System.out.print("Enter Path: ");
            String path = validate.chekInputPath("file");
            File file = new File(path);
            Scanner reader = new Scanner(file);
            System.out.print("Enter Word: ");
            String keySearch = validate.checkInputString();
            int count = 0;
            //Đọc kí tự trong file
            while (reader.hasNext()) {
                String word = reader.next();
                if (word.equals(keySearch)) {
                    count++;
                }
            }
            System.out.println("Bout: " + count);
            System.out.println("");
            reader.close();
        } catch (IOException ex) {
            System.out.println("File is not exist!\n");
        }
    }

    //Find file by word. Có sẵn folder data ở path mặc định để test
    public void getFileNameContainsWordInDirectory() {
        try {
            System.out.println("-------- Find File By Word --------");
            System.out.print("Enter Path: ");
            String path = validate.chekInputPath("folder");
            File folder = new File(path);
            if (!folder.isDirectory()) {
                throw new FileNotFoundException();
            }
            File[] listFile = folder.listFiles();
            System.out.print("Enter Word: ");
            String keySearch = validate.checkInputString();
            System.out.println("------------ File Name ------------");
            Scanner reader;
            for (File file : listFile) {
                reader = new Scanner(file);
                while (reader.hasNext()) {
                    String word = reader.next();
                    if (word.equals(keySearch)) {
                        System.out.println(file.getName());
                        break;
                    }
                }
                reader.close();
            }
            System.out.println("");
        } catch (FileNotFoundException ex) {
            System.out.println("Not exist!\n");
        }
    }
}
