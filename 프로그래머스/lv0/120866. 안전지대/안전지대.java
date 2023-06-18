class Solution {
    public int solution(int[][] board) {
        int n = board.length;
        int answer = n*n;

        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1}; // 주변 범위 설정.
        int[] dy = {-1, -1, -1, 0, 0, 1, 1, 1};

        boolean[][] cnt = new boolean[n][n]; // 확인용 cnt 생성

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < 8; k++) {
                    int nx = i + dx[k];
                    int ny = j + dy[k];
                    if (board[i][j] == 1) {
                        cnt[i][j] = true;
                    }

                    if (nx >= 0 && nx < n && ny >= 0 && ny < n && board[nx][ny] == 1) {
                        // 테두리 범위 설정
                        cnt[i][j] = true;
                    }
                }
            }
        }

        for (int i = 0; i < cnt.length; i++) {
            for (int j = 0; j < cnt.length; j++) {
                if (cnt[i][j]) {
                    answer--;
                }
            }
        }

        return answer;
    }
}
