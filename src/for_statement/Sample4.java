package for_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample4 {
    public static void main(String[] args) throws IOException {
        System.out.println("숫자 몇까지의 합을 구하시겠습니까?");
        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        int sum = 0;
        for(int i =1; i<=num;i++){
            sum += i;
        }
        System.out.println("1부터 " + num + " 까지의 합은 " + sum + "입니다.");
    }
}
