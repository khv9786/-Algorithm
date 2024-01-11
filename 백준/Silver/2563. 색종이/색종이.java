import java.util.*;
import java.io.*;

public class Main {// Boj_2563_색종이
	static int N, M, answer;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		N = Integer.parseInt(st.nextToken()); // 색종이 수
		
		int arr [] = new int [N];
		int paper [][] = new int [100][100];
		for(int i = 0; i<N; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			for(int j = a; j<a+10; j++) {
				for(int k = b; k<b+10; k++) {
					paper[j][k] = 1;
				}
			}
		}
		
		for(int i = 0; i<100; i++) {
			for(int j = 0; j<100; j++) {
				answer += paper[i][j];
			}
		}
		System.out.println(answer);
	}
}