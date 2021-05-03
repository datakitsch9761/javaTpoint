package class_library;

import java.io.IOException;

public class Sample6 {
    public static void main(String[] args) throws IOException {
        System.out.println("car1을 선언했습니다.");
        Car1 car1 = new Car1();
        car1.setCar(1234,20.5);

        Car1 car2 = new Car1();
        System.out.println("car2를 선언했습니다.");

        car2 = car1;
        System.out.println("car2에 car1을 대입했습니다 " +" car1이 가리키는 ");
        car1.show();
        System.out.println("car2가 가리키는 ");
        car2.show();


    }
}
class Car1{
    private int num;
    private double gas;

    public Car1(){
        num =0;
        gas =0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }
    public void setCar(int n, double g){
        num = n;
        gas = g;
        System.out.println("차량번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
    }
    public void show(){
        System.out.println("차량 번호는 " + num + "입니다");
        System.out.println("연료 양은 " + gas + "입니다");
    }
}

