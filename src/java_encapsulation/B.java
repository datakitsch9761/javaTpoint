package java_encapsulation;

public class B extends A {
public void msg1(){
    System.out.println("hello java");
}
    public static void main(String[] args) {
    A a = new A();
    a.msg1();

    }
}
class A{
    public void msg1(){
        System.out.println("Hello java");
    }
}