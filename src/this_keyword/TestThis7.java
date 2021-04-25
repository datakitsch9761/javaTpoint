package this_keyword;

public class TestThis7 {
    public static void main(String[] args) {
        Student02 s1 = new Student02(111,"ankit","Java");
        Student02 s2 = new Student02(112,"sumit","Java",6000f);

        s1.display();
        s2.display();
    }
}

class Student02{
    int rollno;
    String name,course;
    float fee;

    Student02(int rollno,String name, String course){
        this.rollno = rollno;
        this.name = name;
        this.course = course;
    }

    Student02(int rollno, String name,String course, float fee){
        this(rollno, name, course);//reusing constructor
        this.fee = fee;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + course + " " + fee);
    }
}