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
            Scanner sc = new Scanner(file);

            //2 way to read file
            //with loop
            while (sc.hasNextLine())
            {
                System.out.println(sc.nextLine());
            }

            System.out.println();

            //without loop
//            sc.useDelimiter("\\z");
//            System.out.println(sc.next());
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

    }
}
