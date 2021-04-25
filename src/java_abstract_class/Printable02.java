package java_abstract_class;

interface Printable02 {
    void print();
}

interface Showable02{
    void print();
}

class TestInterface3 implements Printable02,Showable02{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        TestInterface3 obj = new TestInterface3();
        obj.print();
    }
}
