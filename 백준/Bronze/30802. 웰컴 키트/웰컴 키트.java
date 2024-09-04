import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int size_cnt = 6;
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[size_cnt];  // N 크기의 배열 생성

        for (int i = 0; i < size_cnt; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        int order_T = 0;
        for (int i = 0; i < size_cnt; i++) {
            order_T += (arr[i] + T - 1) / T;
        }

        int order_P = N / P;
        int order_P_One = N % P;

        StringBuilder sb = new StringBuilder();
        sb.append(order_T).append("\n").append(order_P).append(" ").append(order_P_One);
        System.out.println(sb);
    }
}
