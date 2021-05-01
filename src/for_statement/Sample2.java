package for_statement;

public class Sample2 {
    public static void main(String[] args) {
        int i; //i를 밖에 선언할 경우 for문 밖에서도 i를 사용할 수 있다.
        for(i = 1;i<=5;i++){
            System.out.println(i + "번째 반복입니다.");
        }
        System.out.println((i-1) + "반복이 끝났습니다.");
    }
}
