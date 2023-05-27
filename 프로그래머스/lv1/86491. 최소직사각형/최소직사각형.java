import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int MaxX = 0;
        int MaxY = 0;
        for(int i = 0; i < sizes.length; i++){
            int x = Math.max(sizes[i][0],sizes[i][1]);
            int y = Math.min(sizes[i][0],sizes[i][1]);
            MaxX = Math.max(MaxX,x);
            MaxY = Math.max(MaxY,y);
        }
        return answer = MaxX * MaxY;
    }
}