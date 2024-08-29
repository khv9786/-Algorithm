import java.io.*;
import java.util.*;

public class Main { // 세 용액

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        long[] arr = new long[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        long best = Long.MAX_VALUE;
        long[] result = new long[3];

        for (int i = 0; i < N - 2; i++) {
            for (int j = i + 1; j < N - 1; j++) {
                long now= arr[i];
                long next = arr[j];
                int min = j + 1;
                int max = N - 1;
                int mid = 0;

                long sum = 0;
                while (min <= max) {
                    mid = (min + max) / 2;
                    sum = now + next + arr[mid];

                    if (Math.abs(sum) < Math.abs(best)) {
                        best = sum;
                        result[0] = now;
                        result[1] = next;
                        result[2] = arr[mid];
                    }

                    if (sum > 0) {
                        max = mid - 1;
                    } else if (sum < 0) {
                        min = mid + 1;
                    } else {
                        System.out.println(now + " " + next + " " + arr[mid]);
                        return;
                    }
                }
            }
        }
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}
