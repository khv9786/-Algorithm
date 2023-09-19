class Solution {
    public String solution(String my_string, int s, int e) {
        StringBuilder answer = new StringBuilder();

        String mid = new StringBuilder(my_string.substring(s, e + 1)).reverse().toString();

        answer.append(my_string.substring(0, s));
        answer.append(mid);
        answer.append(my_string.substring(e + 1));

        return answer.toString();
    }
}
