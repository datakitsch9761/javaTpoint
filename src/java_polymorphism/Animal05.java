package java_polymorphism;

class Animal05 {
    void eat(){
        System.out.println("Aniaml is eating....");
    }
}
class Dog03 extends Animal05{
        void eat(){
            System.out.println("dog is eating....");
        }
}

class Babydog extends Dog03{
    public static void main(String[] args) {
        Animal05 obj = new Animal05();
        obj.eat();

    }
}
