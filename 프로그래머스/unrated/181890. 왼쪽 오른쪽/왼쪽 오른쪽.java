import java.util.*;
class Solution {
    public List<String> solution(String[] str_list) {
        List<String> answer = new ArrayList<>();
        int a = 0;
        boolean L_R = true;
        if(str_list.length > 1){
             for(int i = 0; i<str_list.length; i++){
                if(str_list[i].equals("l")){
                  a = i;
                  break;
                }else if (str_list[i].equals("r")){
                    a = i;
                    L_R = false;
                    break;
                }
            }
            if(L_R){
                for(int i = 0; i < a; i++){
                    answer.add(str_list[i]);
                }
            }else{
                for(int i = a+1; i<str_list.length; i++){
                    answer.add(str_list[i]);
                }
            }      
            
        }
                    
        return answer;
    }
}