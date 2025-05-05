package CreateFile;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteByteData {
    public static void main(String[] args) throws Exception {


        try {
            String name = "Rifat";

            FileOutputStream fc = new FileOutputStream("output.txt");

            byte[] nameByte = name.getBytes();
            fc.write(nameByte);

            System.out.println("Data written");


        }
        catch (IOException e) {
            System.out.println(" " + e.getMessage());
        }
    }
}
