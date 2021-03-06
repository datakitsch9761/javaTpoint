package java_static_keyword;

//Test class to show the values of objects
public class TestStaticVariable1 {
    public static void main(String[] args) {
        Student01 s1 = new Student01(111,"Karan");
        Student01 s2 = new Student01(222,"Aryan");

        //we can change the college of all objects by the single line of code
        //Student.college = "BBDIT"
        s1.display();
        s2.display();

    }
}

//Java Program to demonstrate the use of static variable
class Student01{
    int rollno;//instance variable
    String name;//instance variable
    static String college = "ITS";//static variable

    //Constructor
    Student01(int r, String n){
        rollno = r;
        name = n;
    }
    //method to display the values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}