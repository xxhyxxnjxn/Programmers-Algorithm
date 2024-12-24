package src.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Backjoon12891 {
    static int checkSecret = 0; // 몇개의 뮨자와 관련된 개수를 충족했는지 판단하는 변수
    static int[] checkArr;
    static int[] myArr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.valueOf(st.nextToken());
        int p = Integer.valueOf(st.nextToken());
        int result=0;
        char[] dna = new char[s];
        checkArr = new int[4]; // 상태 문자열 ( 숫자 들어가는 문자열)
        myArr = new int[4]; // 현재 상태 문자열 ( 슬라이드 안에 몇개 카운트 되는지 체크하는 문자열)

        dna = br.readLine().toCharArray(); // 문자열 입력
        st=new StringTokenizer(br.readLine());
        for(int i=0;i<4;i++){
            // 상태 문자열 입력
            checkArr[i]=Integer.parseInt(st.nextToken());
            if(checkArr[i]==0){
                checkSecret ++ ;
            }
        }

        for(int i=0; i<p; i ++){ // 문자열 처음 받을 떄 세팅
            check(dna[i]);
        }

        if(checkSecret==4) result ++ ;

        //슬라이딩 윈도우
        for(int i=p; i<s; i++){
            int j = i-p;
            System.out.println(i);
            check(dna[i]);
            remove(dna[j]);

            if(checkSecret==4) result ++ ;
        }

        System.out.println(result);
        br.close();
    }

    private static void remove(char c) {
        switch(c){
            case 'A':
                if(myArr[0]==checkArr[0]){
                    checkSecret--;
                }
                myArr[0]--;
                break;
            case 'C':
                if(myArr[1]==checkArr[1]){
                    checkSecret--;

                }
                myArr[1]--;
                break;
            case 'G':
                if(myArr[2]==checkArr[2]){
                    checkSecret--;

                }
                myArr[2]--;
                break;
            case 'T':
                if(myArr[3]==checkArr[3]){
                    checkSecret--;

                }
                myArr[3]--;
                break;
        }
    }

    public static void check(char x){
        switch(x){
            case 'A':
                myArr[0]++;
                if(myArr[0]==checkArr[0]){
                    checkSecret++;
                }
                break;
            case 'C':
                myArr[1]++;
                if(myArr[1]==checkArr[1]){
                    checkSecret++;
                }
                break;
            case 'G':
                myArr[2]++;
                if(myArr[2]==checkArr[2]){
                    checkSecret++;
                }
                break;
            case 'T':
                myArr[3]++;
                if(myArr[3]==checkArr[3]){
                    checkSecret++;
                }
                break;
        }
    }
}
