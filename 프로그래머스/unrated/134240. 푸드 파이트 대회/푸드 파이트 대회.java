import java.util.*;
class Solution {
    public String solution(int[] food) {

        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        StringBuilder re = new StringBuilder(sb);
        sb.append(0).append(re.reverse());
        
        return sb.toString();
    }
}