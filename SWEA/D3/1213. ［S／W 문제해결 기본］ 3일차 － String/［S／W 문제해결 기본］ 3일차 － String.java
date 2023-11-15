import java.io.*;
import java.util.*;

class Solution { // swea 1959. 두 개의 숫자열 D2
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);

		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			sc.next();
			String find = sc.next();
			String s = sc.next();
			int before = s.length();
			int answer = 0;
			s = s.replace(find, "");
			answer = (before - s.length()) / find.length();

			System.out.println("#" + tc + " " + answer);
		}
	}
}
