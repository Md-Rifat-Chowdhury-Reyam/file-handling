package ReadFile;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.*;
import java.util.*;

import java.util.List;

public class ReadFileWithList {

    public static List<String> ReadList(String file) throws IOException
    {
        List<String> lines = Collections.emptyList();
        lines = Files.readAllLines(Paths.get(file));

        return lines;
    }

    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter file name :");
        String fileName = br.readLine();

        List l = ReadList(fileName);

        Iterator<String> it = l.iterator();

        while (it.hasNext())
        {
            System.out.println(it.next());
        }
    }

}
