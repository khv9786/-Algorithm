import java.util.*;

class Solution {
    public int solution(int n) {
        List<Integer> arr = new ArrayList<>();
        int answer = 0;
        while (n > 0) {
            arr.add(n % 3);
            n /= 3;
        }
        
        int p = 1;
        for (int i = arr.size()-1; i >= 0; i--) {
            answer += arr.get(i) * p;
            p *= 3;
        }
        

        return answer;
    }
}
