import java.io.*;
import java.util.*;

class Solution { // 6913. 동철이의 프로그래밍 대회

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int sum = 0;
			for(int i = 0; i<5; i++) {
				int score = sc.nextInt();
				if(score < 40) {
					score = 40;
				}
				sum += score;
			}
			int answer = sum/5;
			
			System.out.println("#" + tc + " " + answer);
		}
	}
}
