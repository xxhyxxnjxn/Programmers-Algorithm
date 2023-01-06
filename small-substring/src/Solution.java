class Solution {
    public int solution(String t, String p) {
        int p_length = p.length();
        int answer = 0;

        for(int i=0;i<t.length(); i++){
            int t_lastNum = i + p_length;
            long t_substringValue;
            if(t_lastNum <= t.length()){
                t_substringValue = Long.parseLong((t.substring(i,t_lastNum)));
            }else break;

            if(t_substringValue <= Long.parseLong(p)){
                answer ++;
            }
        }
        return answer;
    }
}
