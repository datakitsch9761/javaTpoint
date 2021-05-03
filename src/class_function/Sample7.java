package class_function;

public class Sample7 {
    public static void main(String[] args) {
    Car8 car = new Car8();
    car.setCar(1234,20.5);
    car.show();

        System.out.println("차량 번호만 변경 되었습니다.");
        car.setCar(2345);
        car.show();

        System.out.println("연료량만 변경 되었습니다.");
        car.setCar(30.5);
        car.show();
    }
}
class Car8{
    private int num;
    private double gas;

    public void setCar(int n){
        //int형 인수를 가지는 메소드
        num = n;
        System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
    }
    public void setCar(double g){
        //double형 인수를 가지는 메소드
        gas = g;
        System.out.println("연료 양을 " + gas + "으로 바꾸었습니다.");
    }
    public void setCar(int n, double g){
        //둘 이상의 인수를 가지는 메소드 입니다
        num = n;
        gas = g;
        System.out.println("차량 번호를 " + num + "으로, 연료 양을" + gas + "로 바꾸었습니다.");
    }
    public void show(){
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    }
}
