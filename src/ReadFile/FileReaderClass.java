package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.*;

public class FileReaderClass {


    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter path name : ");
            String pathName = br.readLine();


            FileReader fr = new FileReader(pathName);

            int i;
            while ((i = fr.read()) != -1)
            {
                System.out.print(i + " ");
            }

        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
