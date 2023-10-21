import java.util.*;

public class Solution {
// 문제 x2 또는 K만큼 이동하기.
    public int solution(int n) {
        int ans = 0;
        while(n >= 1) {
            if(n % 2 == 0) {
                n /= 2;
                continue;
            }
            n--;
            ans++;
        }

        return ans;
    }
}