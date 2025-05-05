package DeleteFile;

import java.io.*;
import java.nio.file.*;
import java.util.*;

public class DeleteifexistsMethod {
    public static void main(String[] args) {

        try {
            Scanner scr = new Scanner(System.in);
            System.out.println("Enter path : ");
            String fileName = scr.nextLine();

           boolean deletedFile = Files.deleteIfExists(Paths.get(fileName));
            if (deletedFile) {
                System.out.println("File was successfully deleted");
            } else {
                System.out.println("File did not exist");
            }
            scr.close();

        } catch (NoSuchFileException e) {
            System.out.println("File does not exist");
        } catch (DirectoryNotEmptyException e) {
            System.out.println("Directory is not empty");
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}


//        In the catch block, you can't use multiple exception types with || operator.
//        You should use multiple catch blocks or a single catch with multiple exceptions separated by |.
//        DirectoryNotEmptyException is a subclass of IOException,
//        so you don't need to catch it separately unless you want specific handling for it.

//        catch (IOException || NoSuchFieldException ||DirectoryNotEmptyException e)
//        {
//            System.out.println("Error occured");
//        }


//        catch (IOException | NoSuchFileException  e)
//        {
//            e.printStackTrace();
//            System.out.println(" ");
//        }
