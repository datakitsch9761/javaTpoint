package method_overloading;

public class OverloadingCalculation1 {
    void sum(int a, long b){
        System.out.println(a + b);
    }
    void sum(int a, int b, int c){
        System.out.println(a + b + c);
    }

    public static void main(String[] args) {
        OverloadingCalculation1 o1 = new OverloadingCalculation1();
        o1.sum(20,20);//now second int literal will be promoted to long
        o1.sum(20,20,20);
    }
}
