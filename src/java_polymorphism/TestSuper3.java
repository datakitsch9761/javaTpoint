package java_polymorphism;

public class TestSuper3 {
    public static void main(String[] args) {
    Dog01 d = new Dog01();
    }
}

class Animal02{
    Animal02(){
        System.out.println("Animal is created");
    }
}

class Dog01 extends Animal02{
    Dog01(){super();
        System.out.println("dog is created");}
}