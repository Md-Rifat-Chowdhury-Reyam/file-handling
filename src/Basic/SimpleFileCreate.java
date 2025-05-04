package Basic;

import java.io.File;

public class SimpleFileCreate {
    public static void main(String[] args) {

        File fi = new File("helloJava.txt");

        System.out.println("File created");

        System.out.println(fi.getAbsoluteFile());
    }
}
