import java.util.*;

class Solution {
    public int[] solution(int[] array) {
        int[] answer = new int[2];
        int iMax = 0;
        int index = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] > iMax) {
                iMax = array[i];
                index = i;
            }
        }

        answer[0] = iMax;
        answer[1] = index;
        return answer;
    }
}
