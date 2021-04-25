package java_inheritance;
//Hierarchical Inheritance Example
public class TestInheritance3 {
    public static void main(String[] args) {
    Cat c = new Cat();
    c.meow();
    c.eat();
    }
}

class Animal02{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog02 extends Animal02{
    void bark(){
        System.out.println("Barking");
    }
}

class Cat extends Animal02{
    void meow(){
        System.out.println("Meowing....");
    }
}