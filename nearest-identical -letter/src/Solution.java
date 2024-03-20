import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];

        answer[0] = -1;
        for (int i = 1; i < s.length(); i++) {
            int x = s.lastIndexOf(s.substring(i, i + 1), i - 1);
            if (x != -1) {
                answer[i] = i - x;
            } else {
                answer[i] = x;
            }
        }
        return answer;
    }

    public String solution2(int num) {
        return Math.abs(num % 2) == 0 ? "Even" : "Odd";
    }

    // 2024-03-21 프로그래머스 문제 풀이
    public Integer getStrToInt(String s) {
        return Integer.parseInt(s);
    }

    public int solution3(int num) throws Exception {
        if(num < 0 || num > 3000) {
            throw new Exception("num 조건 위반");
        }

        int i = 1;
        int result = 0;
        for(;;){
            if(num / i == 0) {
                break;
            }
            if( num % i == 0){
                result += i;
            }
            i ++;
        }
        return result;
    }

    public double solution4(int[] arr){
        return Arrays.stream(arr).average().orElse(Double.NaN);
    }

    public int solution5(int num){
        int length  = (int) (Math.log10(num));
        int result = 0;
        for(int i = length ; i >= 1 ; i --){
            int x = (int) Math.pow(10, i);
            result += num / x;
            num = num % x;
        }

        return result + num;
    }
}