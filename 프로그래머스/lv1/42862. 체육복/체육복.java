import java.util.*;
class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        answer = n - lost.length;
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        for(int i = 0; i < lost.length; i ++){
            for(int j = 0; j < reserve.length; j++){
                  if(lost[i] - reserve[j] == 0 ){
                    reserve[j] = -99;
                    lost[i] = -999;
                    answer ++;
                    break;
                }
            }
        }
        
        for(int i = 0; i < lost.length; i ++){
            for(int j = 0; j < reserve.length; j++){
                if(Math.abs(lost[i] - reserve[j]) == 1 ){
                    reserve[j] = -99;
                    answer ++;
                    break;
                }   
            }
        }

        return answer;
    }
}