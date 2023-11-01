import java.util.*;

class Solution // Sweat 4406. 모음이 보이지 않는 사람
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();

		for (int tc = 1; tc <= T; tc++) {
			int N = sc.nextInt();
			int [] arr = new int[N];
			
			for (int i = 0; i < N; i++) {
				arr[i] = sc.nextInt();				
			}
			int start = arr[0];
			int up = 0;
			int down = 0;
			int down_max = 0;
			int up_max = 0;
			
			for (int i = 1; i < N; i++) {
				if(start < arr[i]) {
					up = arr[i] - start;
					up_max = Math.max(up, up_max);
				}else if( start > arr[i]) {
					down = start - arr[i];
					down_max = Math.max(down, down_max);
				}
				start = arr[i];
			}


			System.out.printf("#%d %d %d \n", tc, up_max, down_max);
		}
	}
}
