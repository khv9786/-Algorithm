import java.io.*;
import java.util.*;

public class Main { // 마인크래프트

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[] MineCraft = new int[N * M];
        int blocks = B;
        int max = 0;
        int min = 256;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                int height = Integer.parseInt(st.nextToken());
                MineCraft[i * M + j] = height;
                blocks += height;  // 전체 블록 개수 계산
                max = Math.max(max, height);
                min = Math.min(min, height);
            }
        }

        int maxHeight = min;  // 초기 높이는 최소값으로 설정
        int minTime = Integer.MAX_VALUE;

        for (int i = min; i <= max && i <= (blocks) / (N * M); i++) {
            int time = 0;
            for (int j = 0; j < N * M; j++) {
                int diff = MineCraft[j] - i;

                if (diff > 0) {
                    time += diff * 2;  // 블록 제거
                } else {
                    time -= diff;  // 블록 추가 , diff 는 음수
                }
            }

            if (time <= minTime) {  // 시간이 같은 경우 최대 높이로
                minTime = time;
                maxHeight = i;
            }
        }

        System.out.println(minTime + " " + maxHeight);
    }
}
