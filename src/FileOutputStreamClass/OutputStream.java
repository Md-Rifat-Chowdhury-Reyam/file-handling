package FileOutputStreamClass;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStreamReader;

public class OutputStream {

    public static void fileCreate()
    {
        try {

            BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("enter path name :");
            String path = bf.readLine();

            System.out.println("enter file name :");
            String file = bf.readLine();

            FileOutputStream fos = new FileOutputStream(path + file + ".txt");

            System.out.println("success");
        }
        catch (Exception e)
        {
            System.out.println("failed to create file exception occur");
        }
    }

    public static void main(String[] args) {
        OutputStream.fileCreate();
    }

}
