package src.towpointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Backjoon2018 {
    public static void main(String[] args) throws IOException {
//        myAnswer();
        answer();
    }
    public static void  myAnswer() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int startIndex=1;
        int endIndex=1;
        int sum = 1;
        int count = 1;

        for(int i=startIndex; i<=n; i++) {
            if(sum > n){
                sum = sum - startIndex;
                startIndex ++ ;
            }else if( sum < n ){
                endIndex ++ ;
                sum = sum + endIndex;
            }else {
                endIndex ++ ;
                sum = sum + endIndex;
                count ++ ;
            }
        }

        System.out.println(count);
    }

    public static void answer() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int startIndex=1;
        int endIndex=1;
        int sum = 1;
        int count = 1;

        while (endIndex != n) {
            if(sum == n ){
                count ++;
                endIndex ++;
                sum = sum+endIndex;
            }else if (sum < n ){
                endIndex++;
                sum = sum + endIndex;
            }else {
                sum = sum - startIndex;
                startIndex++;
            }
        }
        System.out.println(count);
    }
}
