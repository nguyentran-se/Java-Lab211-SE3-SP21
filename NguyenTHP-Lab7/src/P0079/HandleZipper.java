package P0079;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

public class HandleZipper {

    Validate validate = new Validate();

    public int menu() {
        System.out.println("========= Zipper program =========");
        System.out.println("1. Compression");
        System.out.println("2. Extraction");
        System.out.println("3. Exit");
        System.out.print("Please choice one option: ");
        return validate.checkInputChoice();
    }

    public void compressTo() {
        try {
            System.out.println("---------- Compression --------");
            System.out.print("Enter Source File: ");
            String sourceFile = validate.chekInputPath("file");
//            String sourceFile = "D:\\test.txt";

            System.out.print("Enter Destination Folder: ");
            String pathCompress = validate.chekInputPath("folder");
            
            System.out.print("Enter Name:");
            String fileZipName = validate.checkInputString();
            
            String desCompress = pathCompress + "\\" + fileZipName + ".zip";
//            String desCompress = "D:\\testData.zip";
            FileOutputStream fos = new FileOutputStream(desCompress);
            ZipOutputStream zipOut = new ZipOutputStream(fos);
            
            File fileToZip = new File(sourceFile);
            FileInputStream fis = new FileInputStream(fileToZip);
            
            ZipEntry zipEntry = new ZipEntry(fileToZip.getName());
            zipOut.putNextEntry(zipEntry);
            
            byte[] bytes = new byte[1024];
            int length;
            while ((length = fis.read(bytes)) >= 0) {
                zipOut.write(bytes, 0, length);
            }
            System.out.println("Successfully!!!\n");
            zipOut.close();
            fis.close();
            fos.close();
        } catch (IOException ex) {
            System.out.println("File not exist!");
        }
    }

    public void extractTo() {
        try {
            System.out.println("---------- Extraction  --------");
            System.out.print("Enter Source File Zip: ");
            String sourceFileZip = validate.chekInputPath("file");
//            String sourceFileZip = "D:\\testing.zip";
            System.out.print("Enter Destination Folder: ");
            String pathExtract = validate.chekInputPath("folder");
//            String pathExtract = "D:\\test folder";
            byte[] buffer = new byte[1024];
            ZipInputStream zis = new ZipInputStream(new FileInputStream(sourceFileZip));
            ZipEntry entry;
            System.out.println("------------ Result -----------");
            while ((entry = zis.getNextEntry()) != null) {
                String entryName = entry.getName();
                File newFile = new File(pathExtract + "\\" + entryName);
                FileOutputStream fos = new FileOutputStream(newFile);
                int len;
                while ((len = zis.read(buffer)) > 0) {
                    fos.write(buffer, 0, len);
                }
                fos.close();
                System.out.println(entryName);
            }
            zis.close();
            System.out.println("Successfully!!!\n");
        } catch (IOException ex) {
            System.out.println("File not exist!");
        }
    }
}
