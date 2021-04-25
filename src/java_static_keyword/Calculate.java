package java_static_keyword;

//Java Program to get the cube of a given number using the static method
class Calculate {
    static int cube(int x){
        return x*x*x;
    }

    public static void main(String[] args) {
        int result = Calculate.cube(3);
        System.out.println(result);
    }
}
