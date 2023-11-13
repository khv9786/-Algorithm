import java.util.*;

public class Main { // 백준 11403번 경로 찾기 S1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int answer = 0;
		int N = sc.nextInt();
		int[][] arr = new int[N][N];
		int[][] can = new int[N][N];
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;

			}
		}
		// 1 == i에서 j로 갈수있으려면. i에서 k가 체크되고, k에서 j가 체크 되어야 가능
		// 거쳐가는 지점인 k로 비교를 해야함. 따라서 k i j 순으로 비교
		for (int k = 0; k < N; k++) {
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][k] == 1 && arr[k][j] == 1) {
						arr[i][j] = 1;
					}
				}
			}
		}

	StringBuilder sb = new StringBuilder();for(
	int i = 0;i<N;i++)
	{
		for (int j = 0; j < N; j++) {
			sb.append(arr[i][j]);
			sb.append(" ");
		}
		sb.append("\n");
	}

	System.out.println(sb);

	}
}