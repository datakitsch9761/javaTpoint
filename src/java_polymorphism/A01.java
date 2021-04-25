package java_polymorphism;

class A01 {
    A01(){
        System.out.println("parent class constructor invoked");
    }
}

class B2 extends A01{
    B2(){
        super();
        System.out.println("child class constructor invoked");
    }
    {
        System.out.println("instance initializer block is invoked");
    }

    public static void main(String[] args) {
        B2 b = new B2();
    }
}
