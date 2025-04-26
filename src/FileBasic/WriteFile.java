package FileBasic;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {

       try
       {
           FileWriter fw = new FileWriter("Rifat.txt");
           fw.write(" Oh i am reyam , nice to meet u");

           fw.close();

           System.out.println("write successfully");
       }
       catch (IOException e)
       {
           System.out.println("error");

           e.printStackTrace();
       }

    }
}
