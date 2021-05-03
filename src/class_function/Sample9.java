package class_function;

public class Sample9 {
    public static void main(String[] args) {
    Car10 car1 = new Car10();
    car1.show();

    Car10 car2 = new Car10(1234,20.5);
    car2.show();
    }
}
class Car10{
    private int num;
    private double gas;

    public Car10() {
        num = 0;
        gas = 0;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public Car10(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("차량 번호가 " + num + "이며, 연료 양이" + gas + "인 자동차가 만들어졌습니다.");
    }
    public void show(){
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    }
}