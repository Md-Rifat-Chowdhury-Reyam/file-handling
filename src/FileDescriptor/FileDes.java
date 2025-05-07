package FileDescriptor;

import java.io.FileDescriptor;
import java.io.FileOutputStream;

public class FileDes {
    public static void main(String[] args) {

        try {

            FileOutputStream fo = new FileOutputStream("output.txt");
            FileDescriptor fd = fo.getFD();

            byte[] name = {82, 105,102, 97, 116}; // in char R i f a t trying to write in ascii

            fo.write(name);
            fd.sync();

            boolean check = fd.valid();
            System.out.println("sync successful " +check);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

//        finally
//        {
//            // releases system resources
//            if(geek_out!=null)
//                geek_out.close();
//        }
    }
}
