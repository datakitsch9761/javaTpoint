package java_serialization;

import java.io.Serializable;

// Serialization : Mechanism of writing the state of an object into a byte-stream
//reverse operation of serialization is called deserialization
public class Student implements Serializable {
    int id;
    String name;
    public Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}
