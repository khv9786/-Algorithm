import java.io.*;
import java.util.*;

public class Main { // S1 Z
    static int r, c, answer = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        answer = 0;
        int size = (int) Math.pow(2, N);
        dfs(size, 0, 0);
        System.out.println(answer);
 }

    public static void dfs(int size, int now_r, int now_c) {
        if (size == 1) {
            return;
        }

        int next_size = size/2 ;

        // 2사분면 -> 1사분면 -> 3사분면 -> 4사분면
        // 만약 4사분면에 있다면 1,2,3 분면은 스킵. 따라서 size^2 * 3 더해줌
        if (r < now_r + next_size && c < now_c + next_size) {
            dfs(next_size, now_r, now_c);
        } else if (r < now_r + next_size && c >= now_c + next_size) {
            answer += next_size * next_size;
            dfs(next_size, now_r, now_c + next_size);
        } else if (r >= now_r + next_size && c < now_c + next_size) {
            answer += 2 * next_size * next_size;
            dfs(next_size, now_r + next_size, now_c);
        } else {
            answer += 3 * next_size * next_size;
            dfs(next_size, now_r + next_size, now_c + next_size);
        }
    }
}