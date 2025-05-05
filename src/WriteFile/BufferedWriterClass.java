package WriteFile;
import java.io.*;

public class BufferedWriterClass {
    public static void main(String[] args) {

        try {
            String txt = "I am from buffered writer";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path name : ");
            String pathName = br.readLine();

            BufferedWriter filePath = new BufferedWriter(new FileWriter(pathName));

            filePath.write(txt);
            filePath.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("The Error : " +e.getMessage());
        }
    }
}
