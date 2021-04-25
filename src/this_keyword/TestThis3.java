package this_keyword;

public class TestThis3 {
    public static void main(String[] args) {
        Student01 s1 = new Student01(111,"ankit",5000f);
        Student01 s2 = new Student01(112,"sumit",6000f);

        s1.display();
        s2.display();
    }
}

class Student01{
    int rollno;
    String name;
    float fee;

    Student01(int r,String n,float f){
        rollno = r;
        name = n;
        fee = f;
    }
    void display(){
        System.out.println(rollno + " " + name + " " + fee);
    }
}
