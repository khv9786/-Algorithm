import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> map = new HashMap<>(); 
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) { 
                int prevIdx = map.get(c);
                answer[i] = i - prevIdx; 
            }
            map.put(c, i); 
        }
        
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == 0) {
                answer[i] = -1;
            }
        }
        
        return answer;
    }
}