package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import Exception.*;

public class HandleFile {
    File fi;
    File fo; 
    FileReader fr;
    BufferedReader br;
    FileWriter fw;
    BufferedWriter bw;
    PrintWriter pw;
    ArrayList<String> text = new ArrayList<>();

    public HandleFile(String pathFileName) throws FileNotFoundException, NotSupportFileType{
        fi = new File(pathFileName);
        if (!fi.isFile()){
            fi = null;
            throw new FileNotFoundException("File Not Found!");
        }
        checkExtension(pathFileName);
    }
    public void checkExtension(String pathFileName) throws NotSupportFileType{
        String [] partOfPath = pathFileName.split("\\.");
        String extension = partOfPath[partOfPath.length-1];
        ArrayList<String> allowExtension = new ArrayList<>(Arrays.asList("txt","docx","doc"));
        if (!allowExtension.contains(extension)){
            fi = null;
            throw new NotSupportFileType("Not support this type of file!");
        }
    }

    public void openRead() throws FileNotFoundException {
        fr = new FileReader(fi);
        br = new BufferedReader(fr);

    }

    public void closeRead() throws IOException{
        br.close();
        fr.close();
    }

    public void readText() throws IOException {
        openRead();
        String line;
        while ((line = br.readLine()) != null){
            if (!line.isEmpty()){
                text.add(line);
            }
        }
        closeRead();
    }
    public void newFileOuput(String pathFileName) throws IOException{
        fo = new File(pathFileName);
        fo.createNewFile();
        
    }
    public void openWrite() throws IOException{
        fw = new FileWriter(fo,false);
        bw = new BufferedWriter(fw);
        pw = new PrintWriter(bw);
    }

    public void closeWrite() throws IOException {
        pw.close();
        bw.close();
        fw.close();
    }
    public void writeText() throws IOException{
        openWrite();
        for (String st : text){
            pw.println(st);
        }
        closeWrite();
    }

    public ArrayList<String> importText() throws IOException{
        
        readText();
        return text;
    }
    public void exportText(ArrayList<String> text){
        this.text = text;
    }
}
