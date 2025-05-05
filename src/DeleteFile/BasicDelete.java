package DeleteFile;
import  java.io.*;


public class BasicDelete {


    public static void main(String[] args) {

//        File deleteFile = new File("C:\\FileHandling\\Delete\\test.txt");

        File deleteFile = new File("output.txt");
        if (deleteFile.delete())
        {
            System.out.println("delete file successfully");
        }
        else
        {
            System.out.println("file not found");
        }
    }
}
