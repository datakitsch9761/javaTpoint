package java_polymorphism;

class Covariant_Return_Type extends A {
    Covariant_Return_Type get(){return this;}
    void message(){
        System.out.println("welcome to covariant return type");
    }
    public static void main(String[] args) {
        new Covariant_Return_Type().get().message();

    }
}

class A{
    A get(){return this;}
}