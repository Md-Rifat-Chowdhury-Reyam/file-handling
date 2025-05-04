package ReadFile;
import java.io.*;
import java.util.*;
import java.nio.file.*;


public class ReadFileWithString {

    public static String readFile(String fileName)throws Exception
    {


            String data = "";
            data = new String(Files.readAllBytes(Paths.get(fileName)));

            return data;


    }

    public static void main(String[] args) throws Exception{

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter file name : " );
            String filePath = br.readLine();

            String data = readFile(filePath);
            System.out.println(data);


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
