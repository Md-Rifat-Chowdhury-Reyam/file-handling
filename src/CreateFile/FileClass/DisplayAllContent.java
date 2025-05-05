package CreateFile.FileClass;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class DisplayAllContent {
    public static void main(String[] args) throws IOException {

        try {
            File fileC = new File("R.txt");

            if(fileC.createNewFile())
            {
                System.out.println("File created --> " + fileC.getPath() +" -->" +fileC.getAbsolutePath());

            }
            else
            {
                System.out.println("File already exist --> "+ fileC.getPath()+" -->" +fileC.getAbsolutePath());
            }

        }

        catch (IOException e)
        {
            e.printStackTrace();
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter your file directory path");

        String dir = br.readLine();

        System.out.println("Enter the dir name");
        String dirName = br.readLine();

        File objF = new File(dir, dirName);

        if(objF.exists())
        {
            String[] arr = objF.list();

            int n = arr.length;

            for (int i = 0; i < n; i++)
            {
                System.out.print(arr[i] + " ");

                File f1 = new File(objF, arr[i]);
                if (f1.isFile())
                {
                    System.out.println("is a file");
                }
                if (f1.isDirectory())
                {
                    System.out.println("it is directory");
                }

            }
            System.out.println("No entities");
        }
        else

        {
            System.out.println("dir not found");
        }
    }
}
