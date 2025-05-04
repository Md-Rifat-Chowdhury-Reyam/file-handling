package ReadFile;

import java.io.*;
import  java.util.*;
public class ScannerClass {

    public static void main(String[] args) {

        try {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Enter your file name :");
            String fileName = br.readLine();

            File file = new File(fileName);

            //2 way to read file
            //with loop
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
