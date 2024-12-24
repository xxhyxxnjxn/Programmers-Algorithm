package src.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baackjoon2559 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //온도 측정한 전체 날짜
        int K = Integer.parseInt(st.nextToken()); //합을 구하기 위한 연속적인 날짜

        int temp[] = new int[N];
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            temp[i]=Integer.parseInt(st.nextToken()); // 측정한 온도
        }

        //기준이 되는 온도의 합 구하기
        int max = 0;
        int sum = 0;
        for(int i=0;i<K;i++){
            sum+=temp[i];
            max=sum;
        }
        // 슬라이드 윈도우 로직
        for (int i = K ; i <N ; i++) {
            sum+=temp[i];
            sum-= temp[i-K];
            if(sum>max){
                max=sum;
            }
        }

        System.out.println(max);
    }
}
