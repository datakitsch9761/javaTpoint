package java_polymorphism;

class Car { }

class Subway extends Car{
    static void method(Car a){
        Subway s = (Subway)a;
        System.out.println("ok downcasting performed");
    }

    public static void main(String[] args) {
        Car a = new Subway();
        Subway.method(a);
    }

}