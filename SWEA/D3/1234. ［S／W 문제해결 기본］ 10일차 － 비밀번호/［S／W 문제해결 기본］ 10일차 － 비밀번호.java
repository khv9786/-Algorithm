import java.io.*;
import java.util.*;

class Solution { // 7102. 준홍이의 카드놀이
	public static List<Integer> pswd;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int T = 10;
		for (int tc = 1; tc <= T; tc++) {
			pswd = new ArrayList<>();
			sc.nextInt();
			String s = sc.next();
			for(int i = 0; i<s.length(); i++) {
				int a = s.charAt(i)-'0';
				pswd.add(a);
			}
			find();
			find();
			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			for(int a : pswd) {
				sb.append(a);
			}
			System.out.println(sb);
		}
	}
	public static void find() {
		for(int i = 1; i<pswd.size(); i++) {
			if(pswd.get(i) == pswd.get(i-1)) {
				pswd.remove(i-1);
				pswd.remove(i-1);				
				i = 1;
			}
		}
	}
}
