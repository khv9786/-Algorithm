import java.io.*;
import java.util.*;

public class Main { // S4 10828 스택
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        Stack<Integer> stack = new Stack<>();

        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();
            switch (cmd) {
                case "push":
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "top":
                    sb.append(stack.isEmpty() ? -1 : stack.peek());
                    sb.append("\n");
                    break;
                case "pop":
                    sb.append(stack.isEmpty() ? -1 : stack.pop());
                    sb.append("\n");
                    break;
                case "empty":
                    sb.append(stack.isEmpty() ? 1 : 0);
                    sb.append("\n");
                    break;
                case "size":
                    sb.append(stack.size());
                    sb.append("\n");
                    break;
            }
        }
        System.out.println(sb);
    }
}
