package WriterClass;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriterClassFile {
    public static void main(String[] args) {

        try {

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the path name : ");
            String path = sc.nextLine();

            FileWriter fw = new FileWriter(path);

            String str = "I am writing";
            fw.write(str);

            fw.close(); // if you forget to add close() method then no character will add in the file.
            System.out.println("Data added in the file " );

        } catch (IOException e) {
            //throw new RuntimeException(e);
            e.printStackTrace();
        }

    }
}
