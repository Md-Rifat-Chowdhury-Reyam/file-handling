package ReadFile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BufferedReaderClass {
    public static void main(String[] args) {

      try {
          //creating BufferedReader for input
          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

          System.out.println("Enter the path : " );
          String path = br.readLine();

          BufferedReader brPath = new BufferedReader(new FileReader(path));

          String st;
          while ((st = brPath.readLine()) != null)
          {
              System.out.println(st);
          }

      }
      catch (IOException e )
      {
          e.printStackTrace();
          System.out.println("Error " + e.getMessage());
      }
    }
}
