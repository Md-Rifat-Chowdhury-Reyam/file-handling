package WriteFile;
import java.io.*;
import java.nio.file.*;


public class WriteStringMethod {

    public static void main(String[] args) {

        try {

            String writeInFile = "I am Rifat Chowdhury, from Bangladesh.";

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Enter the path name : " );
            String pathName = br.readLine();

            Path filePath = Paths.get(pathName); // Path object using Paths.get() , whereas we use writeString() that's why use the path object
            File fileName = filePath.toFile();
            if (fileName.createNewFile()) //File object for the createNewFile()
            {
                System.out.println(fileName + "file create successfully");
            }
            else
            {
                System.out.println("File already created");

            }

            Files.writeString(filePath,writeInFile);
            String fileContent = Files.readString(filePath);
            System.out.println(fileContent);
            System.out.println("Text added in the file " + fileName );


        }
        catch (IOException e)
        {
            e.printStackTrace();
            System.out.println("The error : " + e.getMessage());
        }
    }
}
