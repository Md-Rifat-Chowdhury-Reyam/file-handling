package FileBasic;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try
        {
            File cr = new File("Rifat.java");

            if(cr.createNewFile()) //In order to create a file use the createNewFile() method.
            {
                System.out.println("File created" + cr.getName());

                System.out.println(cr.getAbsoluteFile());
            }
            else
            {
                System.out.println("file already exits");
                System.out.println(cr.getAbsoluteFile());
            }


        }

        catch (IOException e)
        {
            System.out.println("error");
            e.printStackTrace();
        }
    }
}
