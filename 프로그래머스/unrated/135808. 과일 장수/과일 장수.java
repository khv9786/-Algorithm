import java.util.*;

class Solution {
    public Integer solution(int k, int m, int[] score) {
        int answer = 0;
        Arrays.sort(score);

        for(int i = score.length-1; i >= 0; i--){
            if((score.length - i) % m == 0){
                answer += m*score[i];
            }
        }

        return answer;
    }
}
