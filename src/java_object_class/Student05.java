package java_object_class;

class Student05 {
    int rollno;
    String name;

    void insertRecord(int r,String n){
        rollno = r;
        name = n;
    }
    void displayInformation(){
        System.out.println(rollno + " " + name);
    }
}

class TestStudent4{
    public static void main(String[] args) {
        Student05 s1 = new Student05();
        Student05 s2 = new Student05();
        s1.insertRecord(111,"Karan");
        s2.insertRecord(222,"Aryan");
        s1.displayInformation();
        s2.displayInformation();
    }
}
