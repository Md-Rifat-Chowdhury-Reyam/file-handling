package WriterClass;

import java.io.FileWriter;

public class Appending {
    public static void main(String[] args) {

        try {
            FileWriter fw = new FileWriter("output.txt" , true);

            String str = "\n appending text in this file";
            fw.write(str);

            fw.close();
            System.out.println("appended data");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
