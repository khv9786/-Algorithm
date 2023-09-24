import java.util.*;

public class Main {
    static int answer = 0;
    static int N;
    static int K;
    static int[] kit;
    static boolean[] used;

    public static void steroid(int sum, int day) {
        if (day == N) {
            answer++;
            return;
        }

        for (int i = 0; i < N; i++) {
            if (!used[i] && (sum + kit[i] - K) >= 0) {
                used[i] = true;
                steroid(sum + kit[i] - K, day + 1);
                used[i] = false; // 다시 원래대로 바꿔주기. 필수*
            }
        }
    }

    public static void main(String[] args) throws Exception {
        // Input
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt(); // 1 <= N <= 8
        K = sc.nextInt(); // 1 <= K <= 50
        kit = new int[N];
        used = new boolean[N];
        for (int i = 0; i < N; i++) {
            kit[i] = sc.nextInt();
        }

        // Main logic
        steroid(0, 0);

        // Output
        System.out.println(answer);
    }
}
