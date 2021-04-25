package this_keyword;

public class Test1 {
    public static void main(String[] args) {
        new A3().getA3().msg();
    }
}

class A3{
    A3 getA3(){
        return this;
    }
    void msg(){
        System.out.println("Hello Java");
    }
        }