import java.util.*;
class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0;
        int cnt = 0;
        
        int[] arr = new int[n];
        Arrays.fill(arr, 1); // 배열 전부 1로 채우기.
    
        for(int i = 0; i < section.length; i++){
            arr[section[i]-1] = 0; // 빈곳은 0 으로 변경.
        }
        
        for(int i = 0; i < arr.length; i++){ // 배열을 돌면서 빈곳 체크 후 m이면 횟수 증가.
            if(arr[i] == 0 || cnt > 0){
                cnt ++;
            }if(cnt == m){
                    answer ++;
                    cnt = 0;
            }  
        }if(cnt > 0){ // m만큼 안채워졌어도 칠해야한다면 횟수 증가.
            answer ++;
        }
        return answer;
    }
}