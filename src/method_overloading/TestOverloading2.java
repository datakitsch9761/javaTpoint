package method_overloading;

public class TestOverloading2 {
    public static void main(String[] args) {
        System.out.println(Adder02.add(11,11));
        System.out.println(Adder02.add(12.3,12.6));
    }
}

class Adder02{
    static int add(int a, int b){return a+ b;}
    static double add(double a, double b){return a + b;}
}