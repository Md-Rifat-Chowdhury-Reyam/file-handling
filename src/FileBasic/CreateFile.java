package FileBasic;

import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {

        try {
            File newFile = new File("Rifat.text");


            if(newFile.createNewFile())
            {
                System.out.println("file creates "+ newFile.getName());
                System.out.println(newFile.getAbsoluteFile());
            }
            else
            {
                System.out.println("file already exist");
                System.out.println(newFile.getAbsoluteFile());
            }
        }

        catch (IOException e)
        {
            System.out.println("error has occured");

            e.printStackTrace();
        }

    }
}
