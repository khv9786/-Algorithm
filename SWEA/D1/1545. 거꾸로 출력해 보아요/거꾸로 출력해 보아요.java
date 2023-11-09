import java.util.*;

class Solution { // 1545. 거꾸로 출력해 보아요 D1

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		int T = sc.nextInt();
//		
//		for (int tc = 1; tc <= T; tc++) {
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for(int i = n; i>=0; i--) {
			
			if(i == 0) {
				sb.append(i);
			}else {
				sb.append(i+" ");
			}
		}
		System.out.print(sb);
	}
}
