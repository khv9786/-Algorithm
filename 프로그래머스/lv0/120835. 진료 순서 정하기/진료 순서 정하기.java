import java.util.Arrays;

class Solution {
    public int[] solution(int[] emergency) {
        int[] rank = new int[emergency.length];
        int[] emer2 = emergency.clone();
        
        Arrays.sort(emer2);
        for(int i = 0; i < emer2.length; i++) {
            for(int j = 0; j < emergency.length; j++) {
                if(emer2[i] == emergency[j]) {
                    rank[i] = emer2.length - j;
                }
            }
        }
        
        return rank;
    }
}