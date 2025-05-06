package FileReaderClass;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.*;

public class ClassFileReader {
    public static void main(String[] args) {

        try {

            FileReader fileR = new FileReader("output.txt");
            System.out.println("Reading the file txt char by char : \n");

            int i ;
            while((i = fileR.read()) != -1)
            {
                System.out.print((char) i);
            }

            // 2nd way to read
            System.out.println("Read this file with  char array : ");

            char[] readArray1 = new char[10];


            int charRead =  fileR.read(readArray1);// Read characters into the array (returns number of chars read)
            System.out.println(readArray1 );

            while(charRead != -1)
            {
                System.out.println(new String(readArray1,0,charRead));

            }


            //3rd way
            System.out.println("Read this file with array : ");

            String[] readArray = new String[10];
            BufferedReader fileR1 = new BufferedReader(new FileReader("output.txt"));

            // Read lines into the array
            for (int y = 0; y < readArray.length; y++)
            {
                readArray[y] = fileR1.readLine();

                if (readArray[y] == null)
                    break; // Stop if end of file
            }

            // Print the array contents properly
            for (String line : readArray)
            {
                if (line != null)
                {
                    System.out.println(line);
                }
            }

            fileR.close();

        }
        catch ( Exception e)
        {
            e.printStackTrace();
            System.out.println("The error : " + e.getMessage());
        }
    }
}
