package java_object_class;

class Student07 {
    int id;
    String name;
    //creating a parameterized constructor
    Student07(int i,String n){
        id = i;
        name = n;
    }
    //method to display the values
    void display(){
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        //creating objects and passing values
        Student07 s1 = new Student07(111,"Karan");
        Student07 s2 = new Student07(222,"Aryan");
        //calling method to display the values of object
        s1.display();
        s2.display();
    }
}
