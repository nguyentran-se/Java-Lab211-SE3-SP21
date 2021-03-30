package Util;

import java.io.IOException;
import java.util.ArrayList;


public class Normalize {
    private ArrayList<String> text;
    private HandleFile file;

    public Normalize(String pathFileName) throws IOException{
        file = new HandleFile(pathFileName);
        text = file.importText();
    }
    public String omitSpace(String str) {
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        return str;
    }
    public String addSpaceAfterPunctuation(String str){
       String [] chars = str.split("");
       StringBuilder res = new StringBuilder();
       for (String ch : chars){
           if (ch.matches("[.,:!?]")){
               res.append(ch+" ");
           }
           else res.append(ch);
       }
       return res.toString();
    }

    public String omitSpaceQuotes(String str){
        String [] words = str.split("\"");
        StringBuilder res = new StringBuilder();
        for (int i = 0; i< words.length; i++){
            if (i % 2 == 0){
                res.append(words[i]);
            }
            else {
                res.append("\""+words[i].trim()+"\"");
            }
        }
        return res.toString();

    }
    public String capitalize(String str){
        return str.substring(0,1).toUpperCase()+str.substring(1, str.length());
    }
    public String capitalizeFirstCharacter(String str){
        StringBuilder res = new StringBuilder();
        String[] sentences = str.split("\\.\\s");
        res.append(capitalize(sentences[0].trim()));
        for (int i =1; i< sentences.length; i++){
            res.append(". "+capitalize(sentences[i].trim()));
        }
        return res.toString();
    }
    public String addDot(String str){
        if (str.charAt(str.length()-1) != '.' ){
            str+=".";
        }
        return str;
    }
    public void normalize(){
        for (int i=0; i< text.size(); i++){
            text.set(i, omitSpaceQuotes(text.get(i)));
            text.set(i, addSpaceAfterPunctuation(text.get(i)));
            text.set(i, omitSpace(text.get(i)));
            text.set(i, text.get(i).toLowerCase());
            text.set(i, capitalizeFirstCharacter(text.get(i)));
            text.set(i, addDot(text.get(i)));
        }
    }
    public void export(String pathFileName) throws IOException{
        file.exportText(text);
        file.newFileOuput(pathFileName);
        file.writeText();
        file = null;
    }

}
