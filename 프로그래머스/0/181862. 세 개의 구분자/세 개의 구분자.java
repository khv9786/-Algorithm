import java.util.*;

public class Solution {
    public List<String> solution(String myStr) {
        String s = myStr.replaceAll("[abc]", "@");
        String[] temp = s.split("@");
        List<String> answer = new ArrayList<>(); 
        for (String now : temp) {
            if (now.isEmpty()) continue; 
            answer.add(now); 
        }

        if (answer.isEmpty()) { 
            answer.add("EMPTY");
        }
        return answer;
    }
}