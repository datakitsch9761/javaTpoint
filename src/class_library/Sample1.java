package class_library;

public class Sample1 {
    public static void main(String[] args) {
        String str = "hello";
        char ch1 = str.charAt(0);
        char ch2 = str.charAt(1);
        int len = str.length();

        System.out.println(str + "의 첫번째 문자는 " + ch1 + "입니다.");
        System.out.println(str + "의 두번째 문자는 " + ch2 + "입니다.");
        System.out.println(str + "길이는 " + len + "입니다.");
    }
}
