package java_object_class;
// Java program to illustrate how define a class and fields
// Defining a student class.

class Student01 {
//defining fields
int id = 0;//field or data member or instance variables
String name;
// creating main method inside the Student class

public static void main(String[] args) {
    //creating an object or instance
    Student01 s1 = new Student01();
    System.out.println(s1.id);
    System.out.println(s1.name);
    }
}