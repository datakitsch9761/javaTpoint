package java_polymorphism;

class TestSuper2 {
    public static void main(String[] args) {
    Dog d = new Dog();
    d.work();
    }
}

class Animal01 {
    void eat() {
        System.out.println("Eating Bread....");
    }

}

class Dog extends Animal01{
    void eat(){
        System.out.println("eating bread......");
    }

    void bark(){
        System.out.println("barking....");
    }
    void work(){super.eat();bark();}
}