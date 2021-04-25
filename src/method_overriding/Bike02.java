package method_overriding;

public class Bike02 extends Vehicle01 {
    //defining the same method as in the parent class
    void run(){
        System.out.println("Bike is running safely");
    }
    public static void main(String[] args) {
    Bike02 obj = new Bike02();
    obj.run();
    }
}

class Vehicle01{
    //defining a method
    void run(){
        System.out.println("Vehicle is running");
    }
}