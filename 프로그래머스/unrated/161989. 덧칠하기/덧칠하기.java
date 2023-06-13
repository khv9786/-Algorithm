import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int cnt = 0;
        int emp = 0;
        
        int[] arr = new int[n];
        Arrays.fill(arr, 1);
        
        for(int i = 0; i < section.length; i++){
            arr[section[i]-1] = 0;
        }
        
        for(int i = 0; i < arr.length; i++){

          
            if(arr[i] == 0 || cnt > 0){
                cnt ++;
            }
                if(cnt == m){
                    answer ++;
                    cnt = 0;
                }  
        } if(cnt > 0){
            answer ++;
        }
        
        return answer;
    }
}