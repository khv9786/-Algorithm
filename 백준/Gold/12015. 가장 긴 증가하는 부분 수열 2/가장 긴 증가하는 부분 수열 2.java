import java.util.*;
import java.io.*;

public class Main {// 12015번 가장 긴 증가하는 부분 수열 2 G2
	// 이분탐색

	static int N, answer;
	static int[] arr;
	static ArrayList<Integer> list;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		arr = new int[N];
		list = new ArrayList<>();
		list.add(0);
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			int size = list.size();
			// 기존 시작점과 비교
			if (tmp > list.get(size - 1)) {
				list.add(tmp);
			} else {
				int left = 0;
				int right = size - 1;
				// 이분 탐색. 중앙 기준으로 tmp 올바른 위치 찾기.
				while (left < right) {
					int mid = (left + right) / 2;
					if (list.get(mid) >= tmp) {
						right = mid;
					} else {
						left = mid + 1;
					}
				}
				list.set(right, tmp);
			}
		}
		answer = list.size() - 1;
		bw.write(String.valueOf(answer));
		bw.flush();
		bw.close();
	}
}
