import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        Arrays.fill(answer, -1);
        
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            boolean found = false;
            
            for (int j = 0; j < k; j++) {
                if (arr[i] == answer[j]) {
                    found = true;
                    break;
                }
            }
            
            if (!found) {
                answer[index++] = arr[i];
                if (index == k) break; 
            }
        }
        
        return answer;
    }
}
