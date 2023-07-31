import java.util.*;
class Solution {
    public int[] solution(int[] arr) {

        List<Integer> stk = new ArrayList<>();
        int i = 0;
        
        while(i<arr.length){
          if(stk.size() == 0){ //stl에 원소가 없
             stk.add(arr[i]);
              i++;
          }else { // stk에 원소가 있고
            if(arr[i] == stk.get(stk.size()-1) && stk.size() > 0){
                stk.remove(stk.size()-1); // stk 마지막 삭제
                i++;
            }else{
                stk.add(arr[i]);
                i++;
              }
            }
        }
        int[] answer = {-1};
        if(stk.size() == 0){
        }else {
            answer = new int[stk.size()];
            for(int j = 0; j<stk.size(); j++){
                answer[j] = stk.get(j);
            }   
        }
        return answer;
    }
}