import java.util.Scanner;

public class Main {// 6603번 로또

	static int K;
	static int[] S, num;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			K = sc.nextInt();
			if (K == 0) {
				break;
			}
			S = new int[K];
			num = new int[6];

			for (int i = 0; i < K; i++) {
				S[i] = sc.nextInt();
			}
			recursion(0, 0);
			System.out.println();
		}
	}

	static void recursion(int idx, int cnt) {
		StringBuilder sb = new StringBuilder();
		if (cnt == 6) {
			for (int i = 0; i < 6; i++) {
				sb.append(num[i]);
				sb.append(" ");
			}
			System.out.println(sb);
			return;
		}
		if (idx == K) {
			return;
		}
		for (int i = idx; i < K; i++) {
			num[cnt] = S[i];
			recursion(i + 1, cnt + 1);
		}
	}

}