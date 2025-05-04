package FileClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class CreateFileUsingFileClass {
    public static void main(String[] args) {

        createF cf = new createF();

        cf.FileOpen();  //open powershell then run ;
                            //PS C:\Users\Public\Documents> javac CreateFileUsingFileClass.java
                            //PS C:\Users\Public\Documents> java CreateFileUsingFileClass
                            //Enter file name :
                            //MyFile
                            //Enter path name :
                            //C:/Users/Public/
                            //File and path created successful

    }
}

class createF
{
    public void FileOpen()
    {
        try {
            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter file name :");
            String fileName = bf.readLine();

            System.out.println("Enter path name");
            String pathName = bf.readLine();

            File fileObj = new File(pathName, fileName +".txt");

            if(fileObj.createNewFile())
            {
                System.out.println("File and path created successfully");
            }

        }

        catch (Exception  e)
        {
            e.printStackTrace();
            System.out.println("failed to open file");
        }

    }


}
//another way

//import java.io.BufferedReaderClass;
//import java.io.File;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class FileOpen {  // Class names should start with uppercase letter
//
//    public static void createFile() {  // More descriptive method name
//        BufferedReaderClass br = null;
//        try {
//            br = new BufferedReaderClass(new InputStreamReader(System.in));
//
//            System.out.println("Enter file name:");
//            String fileName = br.readLine();
//
//            System.out.println("Enter directory path:");
//            String dirPath = br.readLine();
//
//            // Create directory if it doesn't exist
//            File directory = new File(dirPath);
//            if (!directory.exists()) {
//                directory.mkdirs();
//            }
//
//            // Create file
//            File file = new File(directory, fileName + ".txt");
//
//            if (file.createNewFile()) {
//                System.out.println("File created successfully at: " + file.getAbsolutePath());
//            } else {
//                System.out.println("File already exists.");
//            }
//
//        } catch (IOException ex) {  // More specific exception
//            System.err.println("Error: " + ex.getMessage());
//        } finally {
//            try {
//                if (br != null) {
//                    br.close();
//                }
//            } catch (IOException e) {
//                System.err.println("Error closing reader: " + e.getMessage());
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        createFile();
//    }
//}
