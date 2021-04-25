package java_abstract_class;

interface Printable01 {
    void print();
}

interface Showable{
    void show();
}

class A7 implements Printable01,Showable{
    public void print(){
        System.out.println("Hello");
    }
    public void show(){
        System.out.println("Welcome");
    }
    public static void main(String[] args) {
    A7 obj = new A7();
    obj.print();
    obj.show();
    }
}
