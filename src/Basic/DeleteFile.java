package Basic;

import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {


        //delete method is not support try catch.
        // The delete() method in Java's File class does not require a try-catch block
        // because it does not throw checked exceptions. Instead,
        // it returns a boolean value indicating whether the deletion was successful.
            File AccessObj = new File("Rifat.txt");

            if(AccessObj.delete())
            {
                System.out.println("success to delete");
            }
            else
            {
                System.out.println("File Not found");

                if(!AccessObj.exists())
                {
                    System.out.println("file not exist");
                }
                else
                {
                    System.out.println("Check file permissions or if the file is in use.");
                }
            }



    }
}
