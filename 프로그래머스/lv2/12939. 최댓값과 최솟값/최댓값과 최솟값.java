import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] numbers = s.split(" ");
        int[] cnt = new int[numbers.length];
        
        for (int i = 0; i < numbers.length; i++) {
            cnt[i] = Integer.parseInt(numbers[i]);
        }
        
        Arrays.sort(cnt);
        answer = cnt[0] + " " + cnt[cnt.length - 1];
        
        return answer;
    }
}
