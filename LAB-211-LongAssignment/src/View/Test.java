package View;
import Util.*;
import java.io.IOException;

public class Test {

    public static void main(String[] args) {
        try {
            Normalize nm = new Normalize("src/Example/Input.txt");
            nm.normalize();
            nm.export("src/Example/Output.txt");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

}
