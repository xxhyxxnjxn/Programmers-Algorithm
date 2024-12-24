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
        int n = Integer.valueOf(br.readLine());
        int m = Integer.valueOf(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.valueOf(st.nextToken());
        }
        Arrays.sort(a);

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
