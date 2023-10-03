import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        int a = 0;

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (currentChar == ' ') {
                a = 0;
                sb.append(' '); // Add space to the result string
            } else if (a % 2 == 0) {
                sb.append(Character.toUpperCase(currentChar));
                a++;
            } else if (a % 2 != 0) {
                sb.append(Character.toLowerCase(currentChar));
                a++;
            }
            
        }

        return sb.toString();
    }
}
