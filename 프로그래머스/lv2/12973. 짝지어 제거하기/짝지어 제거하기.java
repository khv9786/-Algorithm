import java.util.*;
class Solution {
    public int solution(String s) {
        int answer = 0;
        Stack<String> stack = new Stack<>();
        String[] split = s.split("");

        for (int i = 0; i < split.length; i++) {
            if (!stack.isEmpty() && stack.peek().equals(split[i])) {
                stack.pop();
            } else {
                stack.push(split[i]);
            }
        }
        return answer = stack.isEmpty() ? 1 : 0;
    }
}