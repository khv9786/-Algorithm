class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        int[] alpha = new int[52];
        boolean space = false;
        
        for (int i = 0; i < my_string.length(); i++) {
            char ch = my_string.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                int index = ch - 'A'; 
                if (alpha[index] == 0) {
                    answer += ch;
                    alpha[index]++;
                }
            } else if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a' + 26; 
                if (alpha[index] == 0) {
                    answer += ch;
                    alpha[index]++;
                }
            } else if (ch == ' ' && !space) {
                answer += ch;
                space = true;
            } else if (ch != ' ') {
                answer += ch;
            }
        }
        
        return answer;
    }
}
