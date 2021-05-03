package class_function;

public class Sample8 {
    public static void main(String[] args) {
    Car8 car = new Car8();
    car.show();
    }
}
class Car9{
    private int num;
    private double gas;

    public Car9() {
        num = 0;
        gas = 0.0;
        System.out.println("자동차가 만들어졌습니다.");
    }
    public void show(){
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    }
}