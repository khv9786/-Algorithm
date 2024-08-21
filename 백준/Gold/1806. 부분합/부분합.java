import java.io.*;
import java.util.*;

public class Main { // 부분합
    public static int N, S;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        S = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int minLength = Integer.MAX_VALUE;
        int sum = 0;
        int start = 0;

        for (int end = 0; end < N; end++) {
            sum += arr[end];
            
            while (sum >= S) {
                minLength = Math.min(minLength, end - start + 1);
                sum -= arr[start];
                start++;
            }
        }

        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}
