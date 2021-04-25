package java_abstract_class;

//Interface declaration : by first user
interface Drawable {
    void draw();
}

//Implementation : by second user
class Rectangle implements Drawable{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class Circle implements Drawable{
    public void draw(){
        System.out.println("drawing circle");
    }
}

class Triangle implements Drawable{
    public void draw(){
        System.out.println("drawing triangle");
    }
}
//Using interface : by third user
class Testinterface1{
    public static void main(String[] args) {
        Drawable d1 = new Circle();// In real scenario, object is provided by method e.g. getDrawable()
        d1.draw();

        Drawable d2 = new Rectangle();
        d2.draw();

        Drawable d3 = new Triangle();
        d3.draw();
    }
}