package this_keyword;

public class TestThis4 {
    public static void main(String[] args) {
        A a = new A();
        a.n();
    }
}

class A{
    void m(){
        System.out.println("hell m");
    }
    void n(){
        System.out.println("hell n");
        this.m();
    }
        }
