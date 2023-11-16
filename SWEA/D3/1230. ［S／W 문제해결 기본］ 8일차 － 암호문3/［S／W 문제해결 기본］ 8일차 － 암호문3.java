import java.io.*;
import java.util.*;

class Solution { // 1230. [S/W 문제해결 기본] 8일차 - 암호문3 D3
	public static Scanner sc = new Scanner(System.in);
	public static List<Integer> list;
	public static String oper[] = { "I", "D", "A" };

	public static void main(String args[]) throws Exception {

		int T = 10;
		// 삽입, 삭제, 추가
		for (int tc = 1; tc <= T; tc++) {
			StringBuilder sb = new StringBuilder();
			int N = sc.nextInt();
			list = new ArrayList<>();
			// input
			for (int i = 1; i <= N; i++) {
				list.add(sc.nextInt());
			}
			int time = sc.nextInt();
			for (int j = 1; j <= time; j++) {
				String Operator = sc.next();
				for (int i = 0; i < oper.length; i++) {
					if (Operator.equals(oper[i])) {
						switch (i) {
						case 0:
							Insert();
							break;
						case 1:
							Delete();
							break;
						case 2:
							Add();
							break;

						}
					}
				}
			}

			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			for (int i = 0; i < 10; i++) {
				sb.append(list.get(i));
				sb.append(" ");
			}
			System.out.println(sb);
		}
	}

	public static void Insert() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 0; i < y; i++) {
			int s = sc.nextInt();
			list.add(x+i, s);
		}
		return;

	}

	public static void Delete() {
		int x = sc.nextInt();
		int y = sc.nextInt();
		for (int i = 1; i <= y; i++) {
			list.remove(x);
		}
		return;
	}

	public static void Add() {
		int y = sc.nextInt();

		for (int i = 0; i < y; i++) {
			int s = sc.nextInt();
			list.add(s);
		}
	}
}
