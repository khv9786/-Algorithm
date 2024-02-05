import java.io.*;
import java.util.*;

public class Main { // Boj_18258_큐 2
	// 리스트로 구현도 가능, 코드가 길어서 덱으로 변경
	public static int N;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		Deque<Integer> deque = new LinkedList<>();
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int input = 0; input < N; input++) {
            st = new StringTokenizer(br.readLine());
            String s = st.nextToken();

            switch (s) {
                case "push":
                    int value = Integer.parseInt(st.nextToken());
                    deque.addLast(value); 
                    break;
                case "pop":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.pollFirst()).append("\n");
                    }
                    break;
                case "size":
                    sb.append(deque.size()).append("\n");
                    break;
                case "empty":
                    sb.append(deque.isEmpty() ? 1 : 0).append("\n");
                    break;
                case "front":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekFirst()).append("\n"); 
                    }
                    break;
                case "back":
                    if (deque.isEmpty()) {
                        sb.append("-1\n");
                    } else {
                        sb.append(deque.peekLast()).append("\n"); 
                    }
                    break;
            }
        }
        System.out.println(sb);
    }
}
