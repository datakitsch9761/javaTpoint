package java_inheritance;
//Multilevel Inheritance Example
public class TestInheritance2 {
    public static void main(String[] args) {
    BabyDog d = new BabyDog();
    d.weep();
    d.bark();
    d.eat();
    }
}

class Animal01{
    void eat(){
        System.out.println("Eating");
    }
}

class Dog01 extends Animal01{
    void bark(){
        System.out.println("Barking");
    }
}

class BabyDog extends Dog01{
    void weep(){
        System.out.println("Weeping");
    }
}
