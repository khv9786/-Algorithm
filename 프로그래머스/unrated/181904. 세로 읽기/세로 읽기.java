class Solution {
    public String solution(String my_string, int m, int c) {
        String answer = "";
        int cnt = my_string.length();
        for(int i = c-1; i<cnt; i += m){
            answer += my_string.charAt(i);
        }
        
        return answer;
    }
}