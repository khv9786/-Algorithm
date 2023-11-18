
import java.util.*;

class Solution {
	public static int[] dr = { 0, 1 };
	public static int[] dc = { 1, 0 };

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			String answer = "error";
			int cnt = 0;
			int N = sc.nextInt();
			char[][] arr = new char[N][N];
			boolean flag = false;
			boolean chk = false;
			int r = 0;
			int c = 0;
			for (int i = 0; i < N; i++) {
				String s = sc.next();
				for (int j = 0; j < N; j++) {
					char ch = s.charAt(j);
					arr[i][j] = ch;
					if (ch == '#') {
						if (!flag) {
							r = i;
							c = j;
							flag = true;
						}
						cnt++;
					}
				}
			}
			int length = (int) Math.sqrt(cnt) - 1;
			if(r+ length < N && c+length < N) {
				square_chk : 
					
				for (int i = r; i <= r+length; i++) {
					for (int j = c; j <= c+length; j++) {
						if(arr[i][j] != '#') {
							chk = false;
							break square_chk ;
						}else {
							cnt --;
						}
					}
				}
			}

			if(cnt == 0) {
				chk = true;
			}
			answer = (chk) ? "yes": "no";

			System.out.println("#" + tc + " " + answer);
		}
	}
}