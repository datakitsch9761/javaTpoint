package if_statement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample7 {
    public static void main(String[] args) throws IOException {
        System.out.println("당신은 남성입니까?");
        System.out.println("Y 또는 N을 입력하십시오");

        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        char res = str.charAt(0);

        if(res == 'Y'|| res =='y'){
            System.out.println("당신은 남성이군요.");
        }
        else if(res == 'N'|| res == 'n'){
            System.out.println("당신은 여성이군요");
        }
        else{
            System.out.println("Y 또는 N을 입력하십시오.");
        }
    }
}
