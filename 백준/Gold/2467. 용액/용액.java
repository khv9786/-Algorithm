import java.io.*;
import java.util.*;

public class Main { // 다각형의 면적
    public static int N;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        int positive = 0, negative = 0, zero = 0, min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            min = Math.min(arr[i], min);
            max = Math.max(arr[i], max);
        }

        if (max <= 0) {
            sb.append(arr[N - 2]).append(" ").append(arr[N - 1]);
//            System.out.println("음수만 있을때 ");
        } else if (min >= 0) {
            sb.append(arr[0]).append(" ").append(arr[1]);
//            System.out.println("양수만 있을때 ");
        } else { // 이분 탐색으로 서칭
            int mid = 0;
            int now = 0;
            int mini = Integer.MAX_VALUE;
            int idx1 = 0, idx2 = 0;

            for (int i = 0; i < N; i++) {
                int low = i + 1;
                int high = N - 1;

                while (low <= high) {
                    mid = (low + high) / 2;
                    now = Math.abs(arr[i] + arr[mid]);

                    if (mini > now) { // 최솟값 갱신
                        mini = now;
                        idx1 = i;
                        idx2 = mid;
                    }

                    if (arr[i] + arr[mid] > 0) {
                        high = mid - 1;
                    } else {
                        low = mid + 1;
                    }
                }
            }
            sb.append(arr[idx1]).append(" ").append(arr[idx2]);
        }

        System.out.println(sb);
    }
}
