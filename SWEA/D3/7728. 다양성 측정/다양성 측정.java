import java.io.*;
import java.util.*;

class Solution { // 7728. 다양성 측정 D3


	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for(int tc = 1; tc<= T; tc ++) {
			String s = sc.next();
			int answer = 0;
			boolean arr[] = new boolean [10];
			for(int i = 0;i<s.length(); i++) {
				int temp = s.charAt(i) - '0';
				arr[temp] = true;
			}
			for(int i = 0; i<arr.length; i++) {
				if(arr[i]) {
					answer ++;
				}
			}
			System.out.println("#"+tc+" "+answer);
		}
	}
}
