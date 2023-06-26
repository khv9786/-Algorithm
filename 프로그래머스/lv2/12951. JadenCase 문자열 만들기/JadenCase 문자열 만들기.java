import java.util.*;

class Solution {
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        s = s.toLowerCase();
        
        if (s.charAt(0) >= 'a' && s.charAt(0) <= 'z') {
            sb.append(Character.toUpperCase(s.charAt(0)));
        }else sb.append(s.charAt(0));
        
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == ' ') {
                if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
                    sb.append(Character.toUpperCase(s.charAt(i)));
                } else {
                    sb.append(s.charAt(i));
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        
        return sb.toString();
    }
}
