package FileOutputStreamClass;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {

        String path = System.getProperty("user.dir");
        System.out.println("Directory " + path);

        try {
            FileOutputStream fc = new FileOutputStream("output.txt", false);

            String name = "\nRifat how are you?\n";
            fc.write(name.getBytes());// The getBytes() method used
            // converts a string into bytes array.


            byte[] arr = {55,56,76,37,66};
            fc.write(arr);

            byte[] array = name.getBytes();// The getBytes() method used
            // converts a string into bytes array.
            fc.write(array);


            fc.flush(); //force to store all data;


            System.out.println("Written success");
            fc.close();//closes the file OutputStream

            //cant write after close();
            //if write then error occur


            fc.write("I am error".getBytes());

        }

        catch (IOException e)
        {
            System.out.println( "Error : " + e.getMessage());
        }
    }
}
