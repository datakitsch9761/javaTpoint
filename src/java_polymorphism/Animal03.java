package java_polymorphism;

class Animal03 {
    void eat(){
        System.out.println("Eating");
    }

static class Dog extends Animal03{
        void eat(){
            System.out.println("Eating Fruits");
        }
}

static class Babydog extends Dog{
        void eat(){
            System.out.println("drinking milk");
        }
}
    public static void main(String[] args){
        Animal03 a1,a2,a3;
        a1 = new Animal03();
        a2 = new Dog();
        a3 = new Babydog();

        a1.eat();
        a2.eat();
        a3.eat();
    }
}
