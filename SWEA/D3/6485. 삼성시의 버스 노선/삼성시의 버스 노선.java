import java.util.*;

public class Solution { // 6485. 삼성시의 버스 노선

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt(); // 노선 개수
			int[] bus = new int [5001];
			for (int i = 0; i < N; i++) {
				int A = sc.nextInt(); // 값 이상의 모든 정류장
				int B= sc.nextInt(); // 값 이하의 모든 정류장
				
				for(int j = A; j<=B; j++){
					bus[j] += 1;
				}
			}

			int P = sc.nextInt();
			int[] C = new int[P];
			for (int i = 0; i < P; i++) {
				C[i] = sc.nextInt();
			}
			StringBuilder sb = new StringBuilder();
			
			sb.append("#"+tc);
			for(int i = 0; i<P;i++) {
				sb.append(" "+bus[C[i]]);
			}
			System.out.println(sb);
			
		} // tc
	}

}
