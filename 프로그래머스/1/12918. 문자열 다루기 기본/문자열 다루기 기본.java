import java.util.*;
class Solution {
    public boolean solution(String s) {
        boolean answer = false;
        int l = s.length();
        if(l == 6 || l == 4){
           for(int i = 0; i<l;i++){
               char temp = s.charAt(i);
               if(!(Character.isDigit(temp))){
                   answer = false;
                   break;
               }
               answer = true;
           }
        }
        
        
        return answer;
    }
}