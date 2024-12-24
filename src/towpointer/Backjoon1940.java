package src.towpointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Backjoon1940 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Scanner와 버퍼리더의 차이 -> 스캐너보다 조금 더 빠름
        int n = Integer.valueOf(br.readLine());
        int m = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        // 띄어쓰기로 여러 문자열을 받을 떄
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(a); // 정렬을 꼭 해야한다.

        int i=0;
        int j=n-1;
        int count = 0;
        while(i<j) {
            if(a[i]+ a[j] > m){
                j--;
            }else if(a[i]+ a[j] < m){
                i++;
            }else if(a[i]+a[j] == m){
                count++;
                i ++ ;
                j -- ;
            }
        }
        System.out.println(count);
    }
}
