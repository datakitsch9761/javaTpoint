package java_abstract_class;
//abstract and non-abstract methods are
//Abstraction : is a process of hiding the implmentation details and showing only functionality to the user.
abstract class Bike {
    abstract void run();
}

class Honda4 extends Bike{
    void run(){
        System.out.println("running safely");
    }

    public static void main(String[] args) {
        Bike obj = new Honda4();
        obj.run();
    }
}
