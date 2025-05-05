package WriteFile;
import java.io.*;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        try {
            String txt = "It is used to write raw stream data to a file.";
            byte[] byteTxt = txt.getBytes();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path name : ");
            String pathName = br.readLine();

            FileOutputStream fileName =new FileOutputStream(pathName);

            fileName.write(byteTxt);

            fileName.close();

        }
        catch (IOException e)

        {
            e.printStackTrace();
            System.out.println("The error : " + e.getMessage() );
        }
    }
}
