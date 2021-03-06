package P0062;

import java.util.Arrays;

public class HandleAnalyzePath {

    private String path;
    private Validate validate = new Validate();

    public void show() {
        System.out.println("===== Analysis Path Program =====");
        System.out.println("Please input Path:");
        path = validate.chekInputPath();
        resultAnalysis();
    }

    public void resultAnalysis() {
        System.out.println("----- Result Analysis -----");
        System.out.print("Disk: " + getDisk());
        System.out.print("\nExtension: " + getExtension());
        System.out.print("\nFile Name: " + getFileName());
        System.out.print("\nPath: " + getPath());
        System.out.print("\nFolders: " + Arrays.toString(getFolders()));
        System.out.println("");
    }

    public String getDisk() {
        return path.split("(?<=:)", 2)[0];
    }

    public String getExtension() {
        return path.split("(\\.)", 2)[1];
    }

    public String getFileName() {
        int index = path.lastIndexOf("\\");
        return path.substring(index + 1).split("(\\.)")[0];
    }

    public String getPath() {
        int index = path.lastIndexOf("\\");
        return path.substring(0, index);
    }

    public String[] getFolders() {
        String[] arrayFolders = path.split("([\\\\||/])");
        return Arrays.copyOfRange(arrayFolders, 1, arrayFolders.length - 1);
    }
}
