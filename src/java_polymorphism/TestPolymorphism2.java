package java_polymorphism;

public class TestPolymorphism2 {
    public static void main(String[] args) {
    Shape obj;
    obj = new Rectangle();
    obj.draw();

    obj = new Circle();
    obj.draw();

    obj = new Triangle();
    obj.draw();
    }
}

class Shape{
    void draw(){
        System.out.println("Drawing....");
    }
}

class Rectangle extends Shape{
    void draw(){
        System.out.println("drawing rectangle....");
    }
}

class Circle extends Shape{
    void draw(){
        System.out.println("drawing circle....");
    }
}

class Triangle extends Shape{
    void draw(){
        System.out.println("drwaing triangle");
    }
}