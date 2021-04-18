package java_object_class;

class Student04{
    int id;
    String name;
}

class TestStudent3{
    public static void main(String[] args) {
        //creating objects
        Student04 s1 = new Student04();
        Student04 s2 = new Student04();

        //intializing objects
        s1.id = 101;
        s1.name = "Sonoo";

        s2.id =102;
        s2.name = "Amit";

        //printing data
        System.out.println(s1.id + " " + s1.name);
        System.out.println(s2.id + " " + s2.name);
    }
}
