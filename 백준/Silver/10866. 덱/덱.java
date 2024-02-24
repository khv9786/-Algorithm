import java.io.*;
import java.util.*;

public class Main { // Boj_10866_덱
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        ArrayDeque<Integer> queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            String[] parts = line.split(" "); // Split the line into command and optional argument
            String command = parts[0];
            int number;

            switch (command) {
                case "push_front":
                    number = Integer.parseInt(parts[1]);
                    queue.offerFirst(number);
                    break;
                case "push_back":
                    number = Integer.parseInt(parts[1]);
                    queue.offerLast(number);
                    break;
                case "front":
                    sb.append(queue.isEmpty() ? -1 : queue.peekFirst()).append("\n");
                    break;
                case "back":
                    sb.append(queue.isEmpty() ? -1 : queue.peekLast()).append("\n");
                    break;
                case "size":
                    sb.append(queue.size()).append("\n");
                    break;
                case "pop_front":
                    sb.append(queue.isEmpty() ? -1 : queue.pollFirst()).append("\n");
                    break;
                case "pop_back":
                    sb.append(queue.isEmpty() ? -1 : queue.pollLast()).append("\n");
                    break;
                case "empty":
                    sb.append(queue.isEmpty() ? 1 : 0).append("\n");
                    break;
                default:
                    break;
            }
        }

        System.out.println(sb);
    }
}