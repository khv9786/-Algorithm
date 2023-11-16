import java.io.*;
import java.util.*;

class Solution { // 13229. 일요일

	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		String[] week = {"", "MON", "TUE", "WED", "THU", "FRI", "SAT", "SUN" };
		for (int tc = 1; tc <= T; tc++) {

			String s = sc.next();
			int answer = 0;
			for(int i = 1; i<=week.length; i++) {
				if(s.equals(week[i])){
					answer = 7 - i;
					break;
				}
			}
			
			if(answer == 0) {
				answer += 7;
			}
			System.out.println("#" + tc + " " + answer);
		}
	}
}
