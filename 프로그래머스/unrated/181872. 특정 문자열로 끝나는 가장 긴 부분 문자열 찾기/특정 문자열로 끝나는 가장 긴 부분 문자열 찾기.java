class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = -1; 
        
        for (int i = myString.length() - 1; i >= pat.length() - 1; i--) {
            String s = "";

            for (int j = i; j >= i - pat.length() + 1; j--) {
                s = myString.charAt(j) + s; 
            }
            
            if (pat.equals(s)) {
                idx = i;
                break; 
            }
        }
        
        if (idx != -1) {
            answer = myString.substring(0, idx + 1);
        }
        
        return answer;
    }
}
