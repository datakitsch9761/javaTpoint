package class_function;

public class Sample1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.num = 1234;
        car1.gas = 20.5;

        System.out.println("차량 번호는 " + car1.num +"입니다.");
        System.out.println("연료 양은 " + car1.gas + "입니다.");
        System.out.println();
        car1.show();
        car1.show();
        System.out.println();
        car1.showCar();

    }
}
class Car1{
    int num;
    double gas;

    void show(){
        System.out.println("차량번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    }
    void showCar(){
        System.out.println("지금부터 자동차의 정보를 표시합니다.");
        show();
    }
}
