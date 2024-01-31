import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main { // Boj_1065_한수
	public static int N, answer;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		N = Integer.parseInt(br.readLine());

		if (N < 100) {
			sb.append(N);
		} else if (N == 1000) {
			sb.append(144);
		} else {
			answer = 99;
			// 무조건 3자리 100 ~ 999
			for (int num = 100; num <= N; num++) {
				int a1 = num / 100;
				int a2 = (num / 10) % 10;
				int a3 = num % 10;
				if (a1 - a2 == a2 - a3) {
					answer++;
				}
			}
			sb.append(answer);
		}
		System.out.println(sb);
	}
}
