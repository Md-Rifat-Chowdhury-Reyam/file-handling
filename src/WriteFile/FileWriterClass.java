package WriteFile;
import java.io.*;

public class FileWriterClass {
    public static void main(String[] args) {

        try {
            String txt = "If the content of the file is short,\n " +
                    "then using the FileWriter class to write in the file is another better option." +
                    " It also writes the stream of characters as the content of the file like writeString() method." +
                    " The constructor of this class defines the default character encoding and the default buffer size in bytes.";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));//buffered reader call for user input
            System.out.println("Enter the path name : ");
            String pathName = br.readLine(); // reading the file name

            FileWriter fileName = new FileWriter(pathName);// creating filewriter object and asign the path name for access writing

            fileName.write(txt); //write the txt varible's value;

            fileName.close();
            System.out.println("file written success");



        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("The error : " + e.getMessage());
        }
    }
}
