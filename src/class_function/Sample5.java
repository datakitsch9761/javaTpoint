package class_function;

public class Sample5 {
    public static void main(String[] args) {
        Car6 car = new Car6();
        car.num=1234;
        car.gas=20.5;
        car.show();
    }
}
class Car6{
    int num;
    double gas;

    void show(){
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas +"입니다.");
    }
}