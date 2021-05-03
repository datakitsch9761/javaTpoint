package class_function;

public class Sample10 {
    public static void main(String[] args) {
    Car11.showSum();

    Car11 car1 = new Car11();
    car1.setCar(1234,20.5);

    Car11.showSum();

    Car11 car2 = new Car11();
    car2.setCar(4567, 30.5);

    Car11.showSum();
    }

}
class Car11{
    //클래스 변수
    public static int sum = 0;
    private int num;
    private double gas;

    public Car11() {
        num = 0;
        gas = 0;
        sum++;
        System.out.println("자동차가 만들어졌습니다.");
    }

    public void setCar(int n, double g) {
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "으로, 연료 양을 " + gas + "로 바꾸었습니다.");
    }
    //클래스 메소드
    public static void showSum(){
        System.out.println("자동차는 모두 " +  sum + "대 있습니다.");
    }
    public void show(){
        System.out.println("차량 번호는 " +  num + "입니다.");
        System.out.println("연료량은 " +  gas + "입니다.");
    }
}
