import java.util.*;

class Solution { // 서버 증설 횟수 LV2
    /*  같은 시간대에 m 명 늘어날때마다 서버 증설 필요.
        n * m <= 인원 < (n+1) * m 이라면 n대의 서버 필요.
       서버는 k 시간 운영 이후 반납.
       서버를 최소 몇번 증설해야 하는지? */
    // -> 서버수 만큼 k범위 가용인원 더해주기, 부족하면 나머지 연산으로 증설 시간별로니까 24번 검증만 필요.

    public int solution(int[] players, int m, int k) {
        int answer = 0;
        int [] server = new int [24];

        for (int i = 0; i < 24; i++) {
            int nowUser = players[i];
            int availableSize = (server[i]+1) * m;
            if(nowUser < availableSize){
                continue;
            }
            int serverCnt = (nowUser - availableSize  + m) / m;
            answer += serverCnt; 

            for (int j = 0; j < k && (i + j) < 24; j++) {
                server[i + j] += serverCnt;
            }
        }
        System.out.println();
        for(int s : server){
            System.out.print(s + " ");
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] players1 = {0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5};
        int m1 = 3, k1 = 5;
        System.out.println(sol.solution(players1, m1, k1)); // 예상 결과: 7

        int[] players2 = {0, 0, 0, 10, 0, 12, 0, 15, 0, 1, 0, 1, 0, 0, 0, 5, 0, 0, 11, 0, 8, 0, 0, 0};
        int m2 = 5, k2 = 1;
        System.out.println(sol.solution(players2, m2, k2)); // 예상 결과: 11

        int[] players3 = {0, 0, 0, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0, 2, 0, 1, 0, 0, 0, 0, 0, 0, 0, 1};
        int m3 = 1, k3 = 1;
        System.out.println(sol.solution(players3, m3, k3)); // 예상 결과: 12
    }
}
