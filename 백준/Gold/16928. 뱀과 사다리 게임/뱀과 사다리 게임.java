import java.io.*;
import java.util.*;

public class Main { // Boj_16928_뱀과 사다리 게임
    public static int N, M; // 사다리와 뱀의 수
    public static int[] map = new int[101];
    public static boolean[] visited = new boolean[101]; // 방문 여부 체크

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        // 사다리와 뱀 입력 처리
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken()); // 사다리 수
        M = Integer.parseInt(st.nextToken()); // 뱀 수
        for (int i = 0; i < N + M; i++) { // 사다리와 뱀의 정보 입력
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            map[start] = end;
        }

        System.out.println(bfs());
    }

    // BFS를 이용하여 최소 주사위 굴림 횟수 계산
    public static int bfs() {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{1, 0}); // 시작 위치와 주사위 굴림 횟수
        visited[1] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int position = current[0];
            int count = current[1];

            if (position == 100) { // 도착지에 도달한 경우
                return count;
            }

            for (int i = 1; i <= 6; i++) { // 주사위 굴리기
                int next = position + i;
                if (next <= 100 && !visited[next]) {
                    visited[next] = true;
                    if (map[next] != 0) { // 사다리나 뱀을 통한 이동
                        if (!visited[map[next]]) {
                            queue.offer(new int[]{map[next], count + 1});
                            visited[map[next]] = true;
                        }
                    } else { // 일반 이동
                        queue.offer(new int[]{next, count + 1});
                    }
                }
            }
        }
        return -1; // 이론적으로 도달할 수 없는 코드
    }
}