import java.lang.reflect.Array;
import java.util.*;

class Solution {
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int answer = 0;
			int arr[] = new int[N];
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();
			}
			Arrays.sort(arr);
			answer = (arr[N-1]*2) + N;
			for (int i = N-2; i >= 0 ; i--) {
				answer += arr[i];
			}
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}