import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String line = br.readLine();
            if (line == null || line.isEmpty()) break;

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            if (n == 1) {
                st.nextToken();  // 단일 입력을 소비
                System.out.println("Jolly");
            } else {
                int[] arr = new int[n];
                int[] cnt = new int[n];

                for (int i = 0; i < n; i++) {
                    arr[i] = Integer.parseInt(st.nextToken());
                    if (i > 0) {
                        int num = Math.abs(arr[i] - arr[i - 1]);
                        if (num < n) {
                            cnt[num]++;
                        }
                    }
                }

                boolean isJolly = true;
                for (int i = 1; i < n; i++) {
                    if (cnt[i] == 0) {
                        System.out.println("Not jolly");
                        isJolly = false;
                        break;
                    }
                }
                if (isJolly) {
                    System.out.println("Jolly");
                }
            }
        }
    }
}
