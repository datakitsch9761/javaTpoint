package java_object_class;

public class TestStaticVariable1{
    public static void main(String[] args) {
        Student11 s1 = new Student11(111,"Karan");
        Student11 s2 = new Student11(222,"Aryan");
        //we can change the college of all objects by the single line of code
        //Student.college = "BBDIT";
        s1.display();
        s2.display();
    }
}
//
class Student11 {
    //instance variable
    int rollno;
    String name;
    static String college = "ITS";//Static Variable

    //constructor
    Student11(int r, String n) {
        rollno = r;
        name = n;
    }

    //method to display the values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
