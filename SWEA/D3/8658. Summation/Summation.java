import java.io.*;
import java.util.*;

class Solution { // 8658. Summation

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 1; tc <= T; tc++) {
			int max = Integer.MIN_VALUE;
			int min = Integer.MAX_VALUE;
			for(int i = 0; i<10; i++) {
				String temp = sc.next();
				int sum = 0;
				for(int j = 0; j<temp.length(); j++) {
					sum += temp.charAt(j)-'0';	
				}
				max = Math.max(max, sum);
				min = Math.min(min,sum);
			}
			System.out.println("#"+tc+" "+max+" "+min);
			
		}
	}
}
