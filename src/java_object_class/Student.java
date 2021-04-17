package java_object_class;
// Java program to illustrate how define a class and fields
// Defining a student class.

class Student {
//defining fields
int id;//field or data member or instance variables
String name;
// creating main method inside the Student class

public static void main(String[] args) {
    //creating an object or instance
    Student s1 = new Student();
    System.out.println(s1.id);
    System.out.println(s1.name);
    }
}