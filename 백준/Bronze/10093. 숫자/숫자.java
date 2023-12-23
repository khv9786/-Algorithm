import java.util.*;
import java.io.*;

public class Main {// 10093번 숫자 B2 23% 길래..
	// 구현 뭐야 나도 틀렸네 방심하지 맙시당
	static long A, B;
	static long answer, cnt;
	static StringBuilder sb;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		A = Long.parseLong(st.nextToken());
		B = Long.parseLong(st.nextToken());
		long Big = Math.max(A, B);
		long Small = Math.min(A, B);

		cnt = Big - Small - 1;

		sb = new StringBuilder();
		if(A == B) {
			sb.append(0);
		}else {
			sb.append(cnt);
			sb.append("\n");
			for (long i = Small + 1; i < Big; i++) {
				sb.append(i + " ");
			}
		}
		

		System.out.println(sb);
	}
}
