package FillePermission;

import java.io.FilePermission;
import java.security.PermissionCollection;

public class FilePermissionClass {
    public static void main(String[] args) {
        //equal() , getAction(), hashCode(), implies(), newPermissionCollection()

        boolean check = false;
        boolean implies;
        String status;
        int hasCode;

        FilePermission filePer1 = new FilePermission("output.txt", "read, delete, readlink");
        FilePermission filePer2 = new FilePermission("output.txt", "write, execute");
        FilePermission filePer3 = new FilePermission("input.txt", "read");

        check = filePer1.equals(filePer2);
        status = filePer1.getActions();
        implies = filePer1.implies(filePer2);
        System.out.println("file 1 is equal to file 2 : " + check + "  and actions : " + status + "  and implies : " + implies );


        check = filePer2.equals(filePer2);
        status = filePer2.getActions();
        hasCode = filePer2.hashCode();
        implies = filePer2.implies(filePer2);
        System.out.println("file 2 is equal to file 2 : " + check + "  and actions : " + status + " and hasCode :" +hasCode + "  and implies : " + implies );

        check = filePer3.equals(filePer1);
        System.out.println("File 3 is equal to file 1 : " + check);


        //permission
        PermissionCollection pc = filePer1.newPermissionCollection();
        pc.add(filePer1);
        check = pc.implies(filePer1);
        System.out.println("Is permission collection working : " + check);




    }
}
