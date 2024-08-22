import java.io.*;
import java.util.*;

public class Main { // 스도쿠
    static int N = 9;
    static int[][] arr = new int[N][N];
    static List<int[]> zeroList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < N; j++) {
                arr[i][j] = line.charAt(j) - '0';
                if (arr[i][j] == 0) {
                    zeroList.add(new int[]{i, j});
                }
            }
        }

        dfs(0);
    }

    static boolean check(int y, int x, int n) {
        for (int i = 0; i < N; i++) {
            if (arr[y][i] == n || arr[i][x] == n) {
                return false;
            }
        }

        int ny = (y / 3) * 3;
        int nx = (x / 3) * 3;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[ny + i][nx + j] == n) {
                    return false;
                }
            }
        }
        return true;
    }

    static void dfs(int idx) {
        if (idx == zeroList.size()) {
            printBoard();
            System.exit(0);
        }

        int[] pos = zeroList.get(idx);
        int y = pos[0], x = pos[1];

        for (int i = 1; i <= 9; i++) {
            if (check(y, x, i)) {
                arr[y][x] = i;
                dfs(idx + 1);
                arr[y][x] = 0;
            }
        }
    }

    static void printBoard() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                sb.append(arr[i][j]);
            }
            sb.append("\n");
        }
        System.out.print(sb);
    }
}
