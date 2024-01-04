import java.util.*;
import java.io.*;

public class Main { // 5347번 LCM
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for(int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            int big = Math.max(a, b);
            int small = Math.min(a, b);

            long answer = (long) big * small;

            while(small != 0) {
                int temp = small;
                small = big % small;
                big = temp;
            }

            answer /= big;

            System.out.println(answer);
        }
    }
}
