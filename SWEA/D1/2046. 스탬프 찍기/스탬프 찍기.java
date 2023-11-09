import java.util.*;

class Solution { // 2046. 스탬프 찍기 D1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int T = sc.nextInt();
//		
//		for (int tc = 1; tc <= T; tc++) {
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for(int i = n; i>=1; i--) {			
				sb.append("#");			
		}
		System.out.print(sb);
	}
}
