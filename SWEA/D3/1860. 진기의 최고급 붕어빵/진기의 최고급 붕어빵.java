import java.io.*;
import java.util.*;

class Solution { // 1860. 진기의 최고급 붕어빵
	public static int N, M, K;
	public static int[] arr;

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			N = sc.nextInt();
			M = sc.nextInt(); // 시간을 들이면
			K = sc.nextInt(); // K만큼 붕어빵 생산
			arr = new int[N];
			String answer = "Possible";
			
			for(int i = 0; i<N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			
			
			if(!BoongUhBbang()) {
				answer = "Impossible";
			}

			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			sb.append(answer);

			System.out.println(sb);
		}
	}

	public static boolean BoongUhBbang() {
		int have = 0;
		int time = 0;
		int idx = 0;
		
		for (int i = 0; i < N; i++) {
			idx ++;
			time = arr[i];
			have = time / M * K;
			if(have < idx) {
				return false;
			}
		}
		return true;
	}
}
