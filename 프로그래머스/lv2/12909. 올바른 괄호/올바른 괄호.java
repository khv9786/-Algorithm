class Solution {
    boolean solution(String s) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c == '(') {
                count++;
            } else if (c == ')' && count > 0) {
                count--;
            } else {
                return false; 
            }
        }
        return count == 0; 
    }
}