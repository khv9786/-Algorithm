import java.util.*;

class Solution { // 2046. 스탬프 찍기 D1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = 10;
		
		for (int tc = 1; tc <= T; tc++) {
			sc.nextInt();
			int arr[][] =  new int [100][100];
			for(int i = 0; i<100; i++) {
				for(int j = 0; j<100; j++) {
					arr[i][j] = sc.nextInt();
				}
			}
			int answer = Integer.MIN_VALUE;
			int sum = 0;
			// 가로
			for(int i = 0; i<100; i++) {
				sum = 0;
				for(int j = 0; j<100; j++) {
					sum += arr[i][j];
				}
				answer = Math.max(answer, sum);
			}
			// 세로
			for(int i = 0; i<100; i++) {
				sum = 0;
				for(int j = 0; j<100; j++) {
					sum += arr[j][i];
				}
				answer = Math.max(answer, sum);
			}
			
			// 대각선 정방향
			sum = 0;
			for(int i = 0; i<100; i++) {				
				sum += arr[i][i];				
			}
			answer = Math.max(answer, sum);
			
			// 대각선 역방향
			sum = 0;
			for(int i = 0; i<100; i++) {			
				sum += arr[99 -i][i];				
			}
			answer = Math.max(answer, sum);
			
			System.out.println("#"+tc+" "+answer);
		}	
	}
}
