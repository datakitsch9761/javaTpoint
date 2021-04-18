package java_object_class;

class Student08 {
    int id;
    String name;
    int age;
//creating two arg constructor


    public Student08(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Student08(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println(id + " " + name + " " + age);
    }

    public static void main(String[] args) {
        Student08 s1 = new Student08(111,"Karan");
        Student08 s2 = new Student08(222,"Aryan",26);
        s1.display();
        s2.display();
    }
}
