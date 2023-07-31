import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        List<Integer> measure = new ArrayList<>();
        
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }
        list.add(n);

        for (int i = 0; i < list.size(); i++) {
            int a = 0;
            for (int j = 1; j <= list.get(i); j++) { // Corrected the loop condition here
                if (list.get(i) % j == 0) {
                    a++;
                }
                if (a > 2) {
                    break;
                }
            }
            if (a <= 2) {
                measure.add(list.get(i));
            }
        }

        int[] answer = new int[measure.size()];
        
        for (int i = 0; i < measure.size(); i++) {
            answer[i] = measure.get(i);
        }
        return answer;
    }
}
