package array_list;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class Sample8 {
    public static void main(String[] args) throws IOException {
        InputStream in;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] test = new int[5];
        System.out.println(test.length + "명의 점수를 입력하십시오.");
        for(int i =0;i< test.length;i++){
            String str = br.readLine();
            test[i] = Integer.parseInt(str);
        }
//        배열을 정렬합니다. 큰 것 부터 정렬하는 방법 부등호만 바꿔주면 오름차순 내림차순으로 정렬이 된다.
        for(int s=0;s<test.length-1;s++){
            for (int t=s+1;t< test.length;t++){
                if(test[t] > test[s]){
                    int tmp = test[t];
                    test[t] = test[s];
                    test[s] = tmp;
                }
            }
        }

        for(int j = 0;j<test.length;j++){
            System.out.println((j+1)+"번째 사람의 점수는" + test[j] + "입니다.");
        }
    }
}
