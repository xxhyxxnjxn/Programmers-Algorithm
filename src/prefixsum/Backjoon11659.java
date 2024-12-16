package src.prefixsum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon11659 {
    public static void main(String[] args) throws IOException {
        myAnswer();
    }
    public static void myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 옆으로 길게 늘어지는 input 값이면 int 로 받기 힘들다 따라서 StringTokenizer 사용
        StringTokenizer stringTokenizer =  new StringTokenizer(br.readLine());
        int suNoSize = Integer.parseInt(stringTokenizer.nextToken());
        int quizNoSize = Integer.parseInt(stringTokenizer.nextToken());

        long[] quizNo= new long[suNoSize + 1]; // long 배열이면 빈 공간에 0 으로 채워짐
        // Long[] 이면 널포인트 뜬다
        // why? Long은 객체를 담기 때문, 객체의 초기값이 null이기 때문

        stringTokenizer =  new StringTokenizer(br.readLine());
        for (int i = 1; i <= suNoSize; i++) {
            quizNo[i] = quizNo[i - 1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for(int i = 1; i <= quizNoSize; i++){
            stringTokenizer =  new StringTokenizer(br.readLine());
            int x = Integer.parseInt(stringTokenizer.nextToken());
            int y = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(quizNo[y]-quizNo[x-1]);
        }
    }
}
