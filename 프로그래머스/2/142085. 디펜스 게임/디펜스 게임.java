import java.util.*;

class Solution {
    public int solution(int n, int k, int[] enemy) {
        int answer = 0;
         PriorityQueue<Integer> pQ = new PriorityQueue<>();
        for (int i = 0; i < enemy.length; i++) {
            if (k > 0) {
                pQ.offer(enemy[i]);
                k--;
            } else {
                if (!pQ.isEmpty() && pQ.peek() < enemy[i]) {
                    n -= pQ.poll();
                    pQ.offer(enemy[i]);
                } else {
                    n -= enemy[i];
                }
            }
            if (n < 0) {
                break;
            }
            answer++;
        }

        return answer;
    }
}