import java.io.*;
import java.util.*;

class Solution { // swea 1225. [S/W 문제해결 기본] 7일차 - 암호생성기 D3
// 40사이클이면 모든 수 -15
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);	
		int T = 10;
		
		for (int tc = 1; tc <= T; tc++) {
			sc.next();
			int n = 8;
			int Min = Integer.MAX_VALUE;
			Queue<Integer> que = new LinkedList<>();
			int [] arr = new int [8];
			for(int i = 0; i<n; i++) {
				int a = sc.nextInt();
				arr[i] = a;
				Min = Math.min(a, Min);
			}

			if(Min > 15) {
				int div = Min / 15;
				for(int i = 0; i<n; i++) {
					arr[i] = (arr[i] - div * 15) + 15;
					que.add(arr[i]);
				}
			}else {
				for(int i = 0; i<n; i++) {
					que.add(arr[i]);
				}
			}
			
			int idx = 1;
			while(!que.contains(0)) {
				if(idx > 5) {
					idx = 1;
				}
				int temp = que.poll();
				temp -= idx;
				if(temp < 0) {
					temp = 0;
				}
				que.add(temp);
				idx++;
			}
			
			StringBuilder sb = new StringBuilder();
			sb.append("#");
			sb.append(tc);
			sb.append(" ");
			while(!que.isEmpty()) {
				sb.append(que.poll());
				sb.append(" ");
			}
			System.out.println(sb);
			
		}
	}

}
