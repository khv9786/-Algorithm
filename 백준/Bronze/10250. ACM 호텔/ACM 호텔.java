import java.io.*;
import java.util.*;

public class Main { // ACM 호텔
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken()); // 높이
            int b = Integer.parseInt(st.nextToken()); // 호수
            int c = Integer.parseInt(st.nextToken()); // N번째
            // 높이 나머지 연산
            int floor = c % a == 0 ? a : c % a;
            int number = (c % a == 0) ? c / a : c / a + 1;

            if (number < 10) {
                sb.append(floor).append(0).append(number).append("\n");
            } else {
                sb.append(floor).append(number).append("\n");
            }
        }
        System.out.println(sb);
    }
}
