import java.util.*;
import java.io.*;

public class Main {// 18808번 스티커 붙이기 G3
	// 브루트포스
	// 1. 스티커를 붙일 수 있다면 가장 위쪽, 왼쪽이다.
	// 2. 붙일 수 없다면 시계방향으로 90도씩 회전한다.
	// 회전 점화식 (r,c) = (c,c-r-1)
	static int Tc, N, M;
	static int answer, cnt;
	static int[] priority;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		Tc = Integer.parseInt(st.nextToken());

		for (int T = 1; T <= Tc; T++) {
			st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			priority = new int[N];
			st = new StringTokenizer(br.readLine());
			Queue<int[]> que = new LinkedList<>();
			for (int i = 0; i < N; i++) {
				int tmp = Integer.parseInt(st.nextToken());
				priority[i] = tmp;
				que.add(new int[] { i, tmp });
			}
			// 중요도 sorting
			Arrays.sort(priority);
			
			int cnt = 0; // 인쇄 순서
			int idx = 1;
			sb = new StringBuilder();
			
			while (!que.isEmpty()) {
				int[] front = que.poll();
				// 만약 지금 중요도가 가장 높은 수치라면
				if (front[1] == priority[N - idx]) {
					// 중요도 조정 및 출력
					idx++;
					cnt++;
					// 현재 출력하는게 원하는 idx였다면 출력 후 종료
					if (front[0] == M) {
						System.out.println(cnt);
						break;
					}
				}else {
					que.add(front);
				}
			}
		}

	
	}
}
