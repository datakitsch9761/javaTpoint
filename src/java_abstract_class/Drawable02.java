package java_abstract_class;

interface Drawable02 {
    void draw();
    static int cube(int x){return x*x*x;}
}

class Rectangle02 implements Drawable02{
    public void draw(){
        System.out.println("drawing rectangle");
    }
}

class TestinterfaceStatic{
    public static void main(String[] args) {
        Drawable02 obj = new Rectangle02();
        obj.draw();
        System.out.println(Drawable02.cube(3));
    }
}
