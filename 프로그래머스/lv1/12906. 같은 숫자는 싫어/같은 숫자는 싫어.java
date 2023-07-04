import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int temp = -1;
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != temp) {
                answer.add(arr[i]);
                temp = arr[i];
            }
        }
        return answer;
    }
}
