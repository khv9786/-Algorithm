import java.util.*;
import java.io.*;

public class Main { // Boj_1138_한 줄로 서기
	public static int N;
	public static int[] arr, answer;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		List <Integer> list = new ArrayList<>();
		N = Integer.parseInt(br.readLine());
		arr = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i = 0; i<N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		// 키카 큰 사람 왼쪽에 몇명있는지가 중요.
		// 고정이 가능함. ex) 4가 제일 큰 사람인데 왼쪽에 2명이라면.
		// 3번에 키가 4인사람인게 확정.
		// 키가 3인사람 왼쪽에 1이라면 4번 확정.
		// 결국 리스트 구현으로 해당 인덱스에 넣어주면 됌.
		for(int i = N-1; i>= 0; i--) {
			list.add(arr[i], i+1);
		}
		
		for(int s : list) {
			sb.append(s + " ");
		}
		
		
		System.out.println(sb);

	}
}