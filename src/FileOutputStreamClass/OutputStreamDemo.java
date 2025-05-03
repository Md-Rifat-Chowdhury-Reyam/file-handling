package FileOutputStreamClass;

import java.io.*;
import java.io.OutputStream;

public class OutputStreamDemo
{
    public static void main(String[] args) throws Exception
    {
        try {

            OutputStream os = new FileOutputStream("file.txt");
            byte b[] = {65, 66, 67, 68, 69, 70};

            //illustrating write(byte[] b) method
            os.write(b);

            //illustrating flush() method
            os.flush();

            //illustrating write(int b) method
            for (int i = 74; i <75 ; i++)
            {
                os.write(i); // see output in file.txt file ;

            }

            os.flush();
            System.out.println("successful");

            //close the stream
            os.close();
        }
        catch (IOException e)
        {
            System.out.println(" ");
        }

    }
}
