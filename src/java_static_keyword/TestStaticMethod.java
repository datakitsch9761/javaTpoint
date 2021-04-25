package java_static_keyword;

//Test class to create and display the values of object
public class TestStaticMethod {
    public static void main(String[] args) {
        Student02.change();//calling change method

        //creating objects
        Student02 s1 = new Student02(111,"Karan");
        Student02 s2 = new Student02(222,"Aryan");
        Student02 s3 = new Student02(333,"Sonoo");

        //calling display method
        s1.display();
        s2.display();
        s3.display();
    }
}

//Java Program to demonstrate the use of a static method
class Student02{
    int rollno;
    String name;
    static String college = "ITS";

    //static method to change the value of static variable
    static void change(){
        college = "BBDIT";
    }
    //constructor to initialise the variable
    Student02(int r,String n){
        rollno = r;
        name = n;
    }
    //method to diplay values
    void display(){
        System.out.println(rollno + " " + name + " " + college);
    }
}
