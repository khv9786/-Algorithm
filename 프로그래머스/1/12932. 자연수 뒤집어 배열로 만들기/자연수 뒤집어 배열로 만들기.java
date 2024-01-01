class Solution {
    public int[] solution(long n) {
        
        
        String s = String.valueOf(n);
        int idx = s.length() -1 ;
        int[] answer = new int[s.length()];
        for(int i = 0; i<s.length(); i++){
           answer[idx] =  s.charAt(i) - '0';
            idx --;
        }
        
        return answer;
    }
}