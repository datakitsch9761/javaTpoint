package class_function;

public class Sample2 {
    public static void main(String[] args) {
        Car2 car2 = new Car2();
        car2.setNum(1234);
        car2.setGas(20.5);
    }
}
class Car2{
    int num;
    double gas;

    void setNum(int n){
        num = n;
        System.out.println("차량 번호를 " + num + "으로 바꾸었습니다.");
    }
    void setGas(double g){
        gas = g;
        System.out.println("연료 양을 " + gas + "으로 바꾸었습니다.");
    }
    void show(){
        System.out.println("차량 번호는 " + num + "입니다.");
        System.out.println("연료 양은 " + gas + "입니다.");
    }
}