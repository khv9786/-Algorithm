import java.util.Scanner;

public class Main {// 1488번 연산자 끼워넣기 - 브루트포스
	public static int N;
	public static int Max = Integer.MIN_VALUE;
	public static int Min = Integer.MAX_VALUE;
	public static int[] num;
	public static int[] oper = new int[4];// 더하기,빼기,곱하기,나누기
	// 만약 N ->6 2,1,1,1이 주어졌다면.
	// 경우의 수는 5C2 + 3P3.
	// 따라서 연산자 개수에 따라 달라짐. 그냥 모든 경우 수 따져야 할듯.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// input
		N = sc.nextInt(); // 2<=N<=11
		num = new int[N];
		for (int i = 0; i < N; i++) {
			num[i] = sc.nextInt();
		}
		for (int i = 0; i < 4; i++) {
			oper[i] = sc.nextInt();
		}

		// logic
		cal(1, num[0]);

		// output
		System.out.println(Max);
		System.out.println(Min);

	}

	public static void cal(int idx, int sum) {
		if (idx == N) { // 연산자를 다 넣은경우 출력
			Max = Math.max(sum, Max);
			Min = Math.min(sum, Min);
			return;
		}
		// 연산자 넣는 모든 경우 확인
		for (int i = 0; i < 4; i++) {
			if (oper[i] > 0) {
				oper[i] -= 1;
				int cur_num = num[idx];
				switch (i) {
				case 0:
					cal(idx +1, sum + cur_num);
					break;
				case 1:
					cal(idx +1, sum - cur_num);
					break;
				case 2:
					cal(idx +1, sum * cur_num);
					break;
				case 3:
					cal(idx +1, sum / cur_num);
					break;
				}
				oper[i] += 1;
			}

		}
	}

}
