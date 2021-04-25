package java_abstract_class;

public interface Printable03 {
    void print();
}

interface Showable03 extends Printable03{
    void show();
}

class TestInterface4 implements Showable03{
    public void print(){
        System.out.println("Hello");
    };
    public void show(){
        System.out.println("Welcome");
    };

    public static void main(String[] args) {
        TestInterface4 obj = new TestInterface4();
        obj.print();
        obj.show();
    }
}
