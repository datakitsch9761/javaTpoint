package for_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise2 {
    public static void main(String[] args) throws IOException {
        System.out.println("시험 점수를 입력하십시오.(0)을 입력하면 종료합니다!!");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        int num = 0;
        int sum = 0;

        do {
            String str = br.readLine();
            num = Integer.parseInt(str);
            sum += num;
        } while(num != 0);
        System.out.println("시험 점수의 합계는 " + sum + "점 입니다.");
    }
}
