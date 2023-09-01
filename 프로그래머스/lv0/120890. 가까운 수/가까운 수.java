import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int currentDifference = Math.abs(array[i] - n);

            if (currentDifference < minDifference) {
                minDifference = currentDifference;
                answer = array[i];
            } else if (currentDifference == minDifference) {
                answer = Math.min(answer, array[i]);
            }
        }

        return answer;
    }
}
