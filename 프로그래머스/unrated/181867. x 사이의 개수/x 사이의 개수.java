class Solution {
    public static int countChar(String str, char ch) {
        int count = 0;
 
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
 
        return count;
    }
    
    public int[] solution(String myString) {
        int a = countChar(myString, 'x') + 1;
        
        int[] answer = new int [a];
        int idx = 0;
        
        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == 'x') {
                idx++;
            }else answer[idx] ++;
            
        }
        
        
        return answer;
    }
}