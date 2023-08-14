class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int[] p = {0, 0};
        int dir = 0; // 0: 오른쪽, 1: 아래, 2: 왼쪽, 3: 위
        
        for (int i = 1; i <= n * n; i++) {
            answer[p[0]][p[1]] = i;
            
            if (dir == 0) {
                if (p[1] + 1 < n && answer[p[0]][p[1] + 1] == 0) {
                    p[1]++;
                } else {
                    dir = 1;
                    p[0]++;
                }
            } else if (dir == 1) { 
                if (p[0] + 1 < n && answer[p[0] + 1][p[1]] == 0) {
                    p[0]++;
                } else {
                    dir = 2; 
                    p[1]--;
                }
            } else if (dir == 2) { 
                if (p[1] - 1 >= 0 && answer[p[0]][p[1] - 1] == 0) {
                    p[1]--;
                } else {
                    dir = 3;
                    p[0]--;
                }
            } else if (dir == 3) { 
                if (p[0] - 1 >= 0 && answer[p[0] - 1][p[1]] == 0) {
                    p[0]--;
                } else {
                    dir = 0; 
                    p[1]++;
                }
            }
        }
        
        return answer;
    }
}
