package java_static_keyword;

class Calculate02 {
    static int number(int x){
        return x+1;}

        Calculate02(int r){
        int number = r;
        }


    public static void main(String[] args) {
        int result = Calculate02.number(5);
        System.out.println(result);
    }
}
