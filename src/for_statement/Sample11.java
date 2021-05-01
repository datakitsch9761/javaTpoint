package for_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample11 {
    public static void main(String[] args) throws IOException {
        System.out.println("몇 번째 처리를 건너 뛰시겠습니까? (1 ~ 10)");

        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int res = Integer.parseInt(str);

        for(int i=0;i<=10;i++){
            if(i == res)
                continue;
            System.out.println(i +"번째 처리입니다.");
        }
    }
}
