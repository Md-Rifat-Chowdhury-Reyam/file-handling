package FileBasic;

import java.io.File;

public class FileCreate {
    public static void main(String[] args) {
        File fi = new File("helloJava.txt");
        System.out.println("File created");
        System.out.println(fi.getAbsoluteFile());
    }
}
