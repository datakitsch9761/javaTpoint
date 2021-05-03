package class_library;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample3 {
    public static void main(String[] args) throws IOException {
        System.out.println("문자열을 입력하십시오.");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        //검색할 문자열을 입력받는 구문
        String str1 = br.readLine();

        System.out.println("안녕하십니까. 검색어를 입력하십시오.");

        //필드를 private 멤버로 바꾸었습니다.
        String str2 = br.readLine();
        char ch = str2.charAt(0);

        //검색할 문자열을 입력받습니다.
        int num = str1.indexOf(ch);

        if(num != -1)
            System.out.println(str1 + "의" + (num + 1) + "번째에서 " + ch + "을(를) 발견했습니다.");
        else
            System.out.println(str1 + "에서" + ch + "을(를) 찾을 수 없었습니다.");
    }
}
