package array_list;

public class Sample10 {
    public static void main(String[] args) {
        int[][] test = {{80,66,22,50},{90,55,68,71},{33,75,63}};

        for(int i=0;i< test.length;i++){
            System.out.println((i+1)+"번째 배열 요소의 길이는 " + test[i].length+"입니다.");
        }
    }
}
