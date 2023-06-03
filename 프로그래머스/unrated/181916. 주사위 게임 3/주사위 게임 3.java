import java.util.*;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int[] dice = {a, b, c, d};
        Arrays.sort(dice);

        if (dice[0] == dice[3]) { // 4개 동일할때
            return 1111 * dice[3];
            
        } else if (dice[0] == dice[2] || dice[1] == dice[3]) { // 세개 같을때
            return (int) Math.pow(dice[1] * 10 + (dice[0] + dice[3] - dice[1]), 2);
            
        } else if (dice[0] == dice[1] && dice[2] == dice[3]) { // 둘둘 같을 때
            return (dice[0] + dice[3]) * Math.abs(dice[3] - dice[0]);
            
        } else if (dice[0] == dice[1]) { // 둘 하나하나 경우
            return dice[2] * dice[3];
            
        } else if (dice[1] == dice[2]) {
            return dice[0] * dice[3];
            
        } else if (dice[2] == dice[3]) {
            return dice[0] * dice[1];
            
        } else if (dice[3] == dice[0]) {
            return dice[1] * dice[2];
        }else {
            return dice[0];
        }
    }
}
