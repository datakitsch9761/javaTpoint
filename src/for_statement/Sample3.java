package for_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample3 {
    public static void main(String[] args) throws IOException {
        System.out.println("몇 개의 *을 출력하시겠습니까?");

        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = Integer.parseInt(str);

        for(int i = 1; i <=num;i++){
            System.out.print("*");
        }

    }
}
