package WriteFile;
import java.io.*;

public class FileOutputStreamClass {
    public static void main(String[] args) {

        FileOutputStream fileName = null;
        try {
            String txt = "It is used to write raw stream data to a file.";
            byte[] byteTxt = txt.getBytes();

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path name : ");
            String pathName = br.readLine();

            fileName =new FileOutputStream(pathName);

            fileName.write(byteTxt);


        }
        catch (IOException e)

        {
            e.printStackTrace();
            System.out.println("The error : " + e.getMessage() );
        }

        //finally keyword execute outside of try catch block
        finally {
            if(fileName != null)
            {

                try {
                    fileName.close();
                }
                catch (IOException e)
                {
                    e.printStackTrace();
                    System.out.println("The error : " + e.getMessage() );
                }
            }
        }
    }
}
