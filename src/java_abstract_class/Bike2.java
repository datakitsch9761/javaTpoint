package java_abstract_class;
//Example of an abstract class that has abstract and non-
abstract class Bike2 {
    Bike2(){//Constructor
        System.out.println("bike is created");}
    abstract void run();//abstract method
    void changeGear(){System.out.println("gear changed");}//method
}
//Creating a Child class which inherits Abstract class from
class Honda extends Bike2{
    void run(){
        System.out.println("running safely");
    }
}

class TestAbstraction2{
    public static void main(String[] args) {
        Bike2 obj = new Honda();
        obj.run();
        obj.changeGear();
    }
}