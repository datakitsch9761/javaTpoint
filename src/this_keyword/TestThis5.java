package this_keyword;

public class TestThis5 {
    public static void main(String[] args) {
    A1 a = new A1(10);
    }
}

class A1{
    A1(){
        System.out.println("hello a");
    }
    A1(int x){
        this();
        System.out.println(x);
    }
}