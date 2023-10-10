class Solution {
    public String solution(String myString, String pat) {
        String answer = "";
        int idx = -1; // Initialize idx with -1 to indicate no match found
        
        for (int i = myString.length() - 1; i >= pat.length() - 1; i--) {
            String s = "";
            
            // Build the string s by iterating from i to i - pat.length() + 1
            for (int j = i; j >= i - pat.length() + 1; j--) {
                s = myString.charAt(j) + s; // Add characters in reverse order
            }
            
            if (pat.equals(s)) {
                idx = i;
                break; // Exit the loop if a match is found
            }
        }
        
        if (idx != -1) {
            answer = myString.substring(0, idx + 1);
        }
        
        return answer;
    }
}
