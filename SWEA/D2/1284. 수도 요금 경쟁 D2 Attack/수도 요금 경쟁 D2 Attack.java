import java.io.*;
import java.util.*;

class Solution { // swea 1284. 수도 요금 경쟁 D2
	public static int[][] ingredient;
	public static int answer, N, L;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int P = sc.nextInt(); // A 1L당 요금
			int Q = sc.nextInt(); // B R리터 이하 요금
			int R = sc.nextInt(); // B 제한 용량
			int S = sc.nextInt(); // B 1L당 요금
			int W = sc.nextInt(); // 한달 수도 양
			
			int A = P * W;
			int temp = 0;
			if( W > R) {
				temp = W-R;
			}
			int B = (temp) * S + Q;
			int answer = Math.min(A, B);
			
			System.out.println("#" + tc + " " + answer);
			
		}
	}

}
