package FileOutputStreamClass;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {

        String path = System.getProperty("user.dir");

        System.out.println("Directory " + path);

        try {
            FileOutputStream fc = new FileOutputStream("filehandling.txt", false);


            String name = "Rifat";
            fc.write(name.getBytes());

            fc.close();
        }

        catch (IOException e)
        {
            System.out.println( " ");
        }
    }
}
