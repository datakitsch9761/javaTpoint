package java_serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

class Persist {
    public static void main(String[] args) {
        try{
            //creating object
            Student s1 = new Student(211,"ravi");
            //creating stream and writing the object
            File file;
            FileOutputStream fout = new FileOutputStream("f.txt");
            ObjectOutputStream out = new ObjectOutputStream(fout);
            out.writeObject(s1);
            out.flush();
            //closing the stream
            out.close();
            System.out.println("success");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
