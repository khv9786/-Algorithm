import java.util.*;
class Solution {
    public String solution(String s) {
        String answer = "";
        
        String [] arr = new String[s.length()];
        for(int i = s.length()-1; i >= 0; i--){
            arr[i] = String.valueOf(s.charAt(i));
        }
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String chr : arr){
            answer += chr;
        }
        
        return answer;
    }
}