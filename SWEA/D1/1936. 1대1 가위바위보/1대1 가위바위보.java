import java.io.*;
import java.util.*;

class Solution { // swea 1936. 1대1 가위바위보 D1

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		String winner = "";
		//가위 1, 바위 2, 보 3
		
		if(a - b == 1) {
			winner = "A";
		}else if (a - b == 2) {
			winner = "B";
		}else if (b - a == 1) {
			winner = "B";
		}else if (b - a == 2) {
			winner = "A";
		}
		System.out.println(winner);
		
//		int T = sc.nextInt();
//		for (int tc = 1; tc <= T; tc++) {
//			
//			
//			System.out.println("#" + tc + " " + answer);
//			
//		}
	}

}
