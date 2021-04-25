package java_polymorphism;

public class TestPolymorphism3 {
    public static void main(String[] args) {
        Animal05 a;
        a = new Dog02();
        a.eat();

        a = new Cat();
        a.eat();

        a = new Lion();
        a.eat();
    }
}

class Animal04{
    void eat(){
        System.out.println("eating....");
    }
}

class Dog02 extends Animal05 {
    void eat(){
        System.out.println("eating bread...");
    }
}

class Cat extends Animal05 {
    void eat(){
        System.out.println("eating rat....");
    }
}

class Lion extends Animal05 {
    void eat(){
        System.out.println("eating meat...");
    }
}