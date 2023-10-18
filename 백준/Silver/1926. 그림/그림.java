import java.util.Scanner;

public class Main {
    static int[][] paper;
    static boolean[][] check;
    static int n, m;
    static int cur_max, cnt;
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};

    public static void main(String[] args) {// 1926 그림 41%
    	//dfs bfs 둘다 가능 dfs 사용
        Scanner sc = new Scanner(System.in);
               
            n = sc.nextInt();
            m = sc.nextInt();
            sc.nextLine();

            paper = new int[n][m];
            check = new boolean[n][m];

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    paper[i][j] = sc.nextInt();
                }
            }

            int max = 0;

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    if (paper[i][j] == 1 && !check[i][j]) {
                    	cur_max = 0; // 탐색 최대값 초기화
                    	cnt ++; // 그림 개수 판단
                        dfs(i, j); // dfs 함수
                        max = Math.max(cur_max, max); // 최대값 넣기                 
                    }
                }
            }
            System.out.println(cnt);
            System.out.println(max);
        }


    private static void dfs(int x, int y) {
    	
    	check[x][y] = true;
        cur_max ++; // 그림 크기 저장

        for (int i = 0; i < 4; i++) {
            int curX = x + dx[i];
            int curY = y + dy[i];

            if (curX >= 0 && curY >= 0 && curX < n && curY < m) {
                if (paper[curX][curY] == 1 && !check[curX][curY]) {
                    dfs(curX, curY);
                }
            }
        }
    }
}
