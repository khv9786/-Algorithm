import java.io.*;
import java.util.*;

public class Main { // AC
    public static int T;
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            boolean position = false; // false == 정방향, true == 역방향
            boolean error = false;
            String cmd = br.readLine();
            int N = Integer.parseInt(br.readLine());
            Deque<Integer> deque = new ArrayDeque<>();

            st = new StringTokenizer(br.readLine(), ",[]");
            while (st.hasMoreTokens()) {
                deque.offer(Integer.parseInt(st.nextToken()));
            }

            for (char c : cmd.toCharArray()) {
                if (c == 'R') {
                    position = !position;
                } else if (c == 'D') {
                    if (deque.isEmpty()) {
                        sb.append("error\n");
                        error = true;
                        break;
                    }
                    if (position) {
                        deque.pollLast();
                    } else {
                        deque.pollFirst();
                    }
                }
            }

            if (!error) {
                sb.append("[");
                while (!deque.isEmpty()) {
                    sb.append(position ? deque.pollLast() : deque.pollFirst());
                    if (!deque.isEmpty()) {
                        sb.append(",");
                    }
                }
                sb.append("]\n");
            }
        }

        System.out.print(sb.toString());
    }
}
