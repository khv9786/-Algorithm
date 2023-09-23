import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Solution {
    public List<Integer> solution(String my_string) {
        List<Integer> answer = new ArrayList<>();
        my_string = my_string.replaceAll("[a-z]", "");
        
        for (int i = 0; i < my_string.length(); i++) {
            char a = my_string.charAt(i);
            if (Character.isDigit(a)) {
                answer.add(Character.getNumericValue(a));
            }
        }
        
        Collections.sort(answer);
        
        return answer;
    }
}