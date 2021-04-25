package java_abstract_class;

public interface Drawble01 {
    void draw();
    default void msg(){
        System.out.println("default method");
    }
}

class Rectangle01 implements Drawble01 {
    public void draw() {
        System.out.println("drawing rectangle");
    }
}
    class TestInterfaceDefault{
        public static void main(String[] args) {
            Drawble01 d = new Rectangle01();
            d.draw();
            d.msg();
        }
    }

