package java_abstract_class;
//An interface in Java is a blueprint of a class
//It has static constants and abstract methods

//Interfaces can have abstract methods and variables
//It cannot have a method body.

//It is used to achieve abstraction
//By interface, we can support the functionality of multiple inheritance
//It can be used to achieve loose coupling.

//Methods in an interface are declared with the empty body
//And all the fields are public, static and final by default.
//A class that implements an interface must implement all the methods declared in the interface.

interface printable {
    void print();
}

class A6{
    public void print(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        A6 obj = new A6();
        obj.print();
    }
}
