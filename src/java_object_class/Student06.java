package java_object_class;
//Let us see another example of default constructor
//Which displays the default values

class Student06 {
int id;
String name;
//method to display the value of id and name
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects
        Student06 s1 = new Student06();
        Student06 s2 = new Student06();


        //displaying values of the object
        s1.display();
        s2.display();
    }
}
