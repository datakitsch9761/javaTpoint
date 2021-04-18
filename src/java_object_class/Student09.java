package java_object_class;

class Student09 {
    int id;
    String name;
    //constructor to initialize integer and string
    Student09(int i,String n){
        id = i;
        name = n;
    }
    //constructor to initialise another object
    Student09(Student09 s){
        id = s.id;
        name = s.name;
    }
    void display(){
        System.out.println(id + " " + name);
    }
    public static void main(String[] args) {
        Student09 s1 = new Student09(111,"Karan");
        Student09 s2 = new Student09(s1);
        s1.display();
        s2.display();
    }
}
