class Solution {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            if (Character.isWhitespace(currentChar)) {
                answer.append(' ');
                continue;
            }

            int shiftedAscii = (currentChar + n);

            if (Character.isLowerCase(currentChar)) {
                if (shiftedAscii > 'z') {
                    shiftedAscii -= 26;
                }
            } else if (Character.isUpperCase(currentChar)) {
                if (shiftedAscii > 'Z') {
                    shiftedAscii -= 26;
                }
            }

            char shiftedChar = (char) shiftedAscii;
            System.out.print(shiftedChar);
            answer.append(shiftedChar);
        }

        return answer.toString();
    }
}