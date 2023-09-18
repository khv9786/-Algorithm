import java.util.*;
class Solution {

    public ArrayList solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j<delete_list.length; j++)
                if(arr[i] == delete_list[j]){
                    break;
                }else{
                    answer.add(arr[i]);
                }
        }
        
        
        return answer;
    }
}