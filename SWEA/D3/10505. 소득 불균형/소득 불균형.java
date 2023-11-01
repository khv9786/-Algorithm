import java.util.*;

class Solution // Sweat 3431. 준환이의 운동관리 D3
{
	public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int n = sc.nextInt();
			int [] arr = new int[n];
			int sum = 0;
			int avg = 0;
			int answer = 0;
			for(int i = 0; i<n; i++) {
				arr[i] = sc.nextInt();
				sum += arr[i];
			}
			
			avg = sum / n;
			for(int i = 0; i<n; i++) {
				if(arr[i] <= avg) {
					answer ++;
				}
			}
			
			System.out.printf("#%d %s\n", tc, answer);
		}
		

	}
}
