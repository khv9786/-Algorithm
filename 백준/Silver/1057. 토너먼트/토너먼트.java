import java.io.*;
import java.util.*;

public class Main { // Boj_1057_토너먼트
	// 안만나는 경우가 없는데..?
	// 시간초과로 if else 제거
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringBuilder sb = new StringBuilder();
//		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int Jimin = Integer.parseInt(st.nextToken());
		int Hansoo = Integer.parseInt(st.nextToken());
		int answer = 0;
		while (Jimin != Hansoo) {
			Jimin = Jimin/2 + Jimin %2;
			Hansoo = Hansoo/2 + Hansoo %2;			
			answer++;
		}
		System.out.println(answer);
	}
}