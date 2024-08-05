import java.io.*;
import java.util.*;

public class Solution {

    public int solution(String s) {
        int answer = 0;
        int s_length = s.length();


        for (int k = 0; k < s_length; k++) {
            boolean isValid = true;
            Stack<Character> stack = new Stack<>();

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (ch == '(' || ch == '[' || ch == '{') {
                    stack.push(ch);
                } else {
                    if (stack.isEmpty()) {
                        isValid = false;
                        break;
                    }
                    char top = stack.pop();
                    if (!chkLogic(top, ch)) {
                        isValid = false;
                        break;
                    }
                }
            }
            if (stack.isEmpty() && isValid) {
                answer++;
//                System.out.println(s);
            }
            s = s.substring(1) + s.charAt(0); 

        }
        return answer;
    }

    private boolean chkLogic(char start, char end) {
        return (start == '(' && end == ')') || (start == '[' && end == ']') || (start == '{' && end == '}');
    }
}
