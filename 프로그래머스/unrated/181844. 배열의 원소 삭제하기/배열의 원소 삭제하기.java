import java.util.*;
class Solution {

    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        // 가변적이기 때문에 배열이 아닌 list사용
        
        for(int i = 0; i < arr.length; i++){ // 먼저 기존 배열만큼 반복
            boolean chk = true; // 겹치는게 있는지 확인 위한 boolean
            for(int j = 0; j<delete_list.length; j++) 
                // delete에 있는 요소 모두 확인
                if(arr[i] == delete_list[j]){ // 만약 있다면
                    chk = false; // chk boolean 변경
                    break;      // 불필요한 반복 X위해 break;
                }
            if(chk){ // 만약 chk가 true라면 -> delete랑 안겹쳤다면
                answer.add(arr[i]); // answer 리스트에 add해주기
            }
        }
        
        
        return answer;
    }
}