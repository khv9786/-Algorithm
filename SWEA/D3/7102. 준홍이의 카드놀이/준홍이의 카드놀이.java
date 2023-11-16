import java.io.*;
import java.util.*;

class Solution { // 7102. 준홍이의 카드놀이

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int M = sc.nextInt();
			int big = Math.max(N, M);
			int small = Math.min(N, M);
			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);

			for (int i = 0; i < big - small + 1; i++) {
				int temp = small + 1 + i;
				sb.append(" ");
				sb.append(temp);
			}

			System.out.println(sb);
		}
	}
}
