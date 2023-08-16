import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length - 5];
        int a = answer.length-1;
        Arrays.sort(num_list);
        
        for(int i = num_list.length -1; i >= 5; i--){
            answer[a] = num_list[i];
            a--;
        }
        return answer;
    }
}