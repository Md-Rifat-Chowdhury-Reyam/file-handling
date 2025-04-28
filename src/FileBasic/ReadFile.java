package FileBasic;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public static void main(String[] args) {
            try {
                File AccessObj = new File("Rifat.txt"); // file access

                Scanner ReadObj = new Scanner(AccessObj); // scan the file

                while(ReadObj.hasNextLine())
                {
                    String data = ReadObj.nextLine();
                    System.out.println(data);

                }
                ReadObj.close();

            }
            catch (FileNotFoundException e)
            {
                e.printStackTrace();
            }
    }
}
