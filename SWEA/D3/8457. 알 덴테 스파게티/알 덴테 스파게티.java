import java.util.*;

public class Solution { // 6485. 삼성시의 버스 노선

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 모래시계 수
			int B = sc.nextInt(); // 요구 시간.
			int E = sc.nextInt(); // 오차
			int answer = 0; // 모래시계 개수
			// B-E ~~ B+E 여야 함

			if (B <= E) {
				answer = 0;
			} else {
				int watch = 0;
				for (int i = 0; i < N; i++) {
					watch = sc.nextInt();
					// temp = 나머지
					int temp = B % watch;
					if(E >= (watch - temp) || temp <= E) {
						answer ++;
					}
				}
			}

			StringBuilder sb = new StringBuilder();

			sb.append("#" + tc);
			sb.append(" " + answer);
			System.out.println(sb);

		} // tc
	}

}
