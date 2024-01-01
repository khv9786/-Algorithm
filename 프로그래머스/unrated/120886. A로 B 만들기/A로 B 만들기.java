class Solution {
    public int solution(String before, String after) {
        int answer = 1;
        int [] alpha = new int [26];
        for(int i = 0; i<before.length(); i++){
            int temp = before.charAt(i) - 'a';
            alpha[before.charAt(i) - 'a']++;
        }
        
        for(int i = 0; i<before.length(); i++){
            alpha[after.charAt(i) - 'a']--;
        }
        
        for(int i = 0; i<alpha.length; i++){
            if(alpha[i] != 0){
                answer = 0;
                break;
            }
        }
        
        
        return answer;
    }
}