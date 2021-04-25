package method_overriding;
//Java Program to demonstrate why we need method overriding
//Here, we are calling the method of parent class with children
//class object.
//Creating a parent class

//overloading : 같은 이름의 메소드를 여러개 가지면서 매개변수의 유형과 개수가 다르도록 하는 기술
//overriding : 상위 클래스가 가지고 있는 메소드를 하위 클래스가 재정의 해서 사용하는 기술

class Bike extends Vehicle{
    public static void main(String[] args) {
    Bike obj = new Bike();
    //calling the method with child class instances
    }
}

class Vehicle{
    void run(){
        System.out.println("Vehicle is running");
    }
}