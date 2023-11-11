import java.util.*;

public class Main { // 11404번 플로이드 G4
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();// city
		int m = sc.nextInt();// bus
		int[][] bus = new int[n + 1][n + 1];
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				bus[i][j] = Integer.MAX_VALUE /2;
				if (i == j) {
					bus[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < m; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			bus[a][b] = Math.min(bus[a][b], c);
		}
		
		//logic
		
		for (int i = 1; i <= n; i++) {
			// i 중간 경로 j 출발 k 도착 
			for (int j = 1; j <= n; j++) {
				for (int k = 1; k <= n; k++) {
					bus[j][k] = Math.min(bus[j][k], bus[j][i] + bus[i][k]);
				}
			}
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (bus[i][j] == Integer.MAX_VALUE/2) {
					bus[i][j] = 0;	
				}
				sb.append(bus[i][j]);
				sb.append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);

	}
}