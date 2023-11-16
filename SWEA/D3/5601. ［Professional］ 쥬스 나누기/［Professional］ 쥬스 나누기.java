import java.io.*;
import java.util.*;

class Solution { // 5601. [Professional] 쥬스 나누기

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int p = 1;// 분자
			int q = 1;// 분모

			StringBuilder sb = new StringBuilder();

			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			for (int j = 0; j < N; j++) {
				sb.append(p);
				sb.append("/");
				sb.append(N);
				if(j == N-1) {
					continue;
				}
				sb.append(" ");
			}

			System.out.println(sb);

		}
	}
}
