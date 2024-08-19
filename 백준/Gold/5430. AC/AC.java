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
            boolean position = true; // true == 정방향, false 역방향
            boolean error = false;
            String cmd = br.readLine();
            int N = Integer.parseInt(br.readLine());
            Deque<Integer> doubleQ = new ArrayDeque<>();
            st = new StringTokenizer(br.readLine(), ",[]");
            while (st.hasMoreTokens()) {
                doubleQ.offer(Integer.parseInt(st.nextToken()));
            }

            for(int k = 0; k < cmd.length(); k++) {
                if(cmd.charAt(k) == 'R') {
                    position = !position;
                } else if(cmd.charAt(k) == 'D') {
                    if(doubleQ.isEmpty()) {
                        sb.append("error").append("\n");
                        error = true;
                        break;
                    }
                    if(position) { // 정방향
                        doubleQ.pop();
                    } else { // 역방향
                        doubleQ.pollLast();
                    }
                }
            }

            if(error) {
                continue;
            }

            sb.append("[");
            if(position) { // 정방향
                while(!doubleQ.isEmpty()) {
                    int temp = doubleQ.poll();
                    sb.append(temp);
                    if(!doubleQ.isEmpty()) {
                        sb.append(",");
                    }
                }
            } else { // 역방향
                while(!doubleQ.isEmpty()) {
                    int temp = doubleQ.pollLast();
                    sb.append(temp);
                    if(!doubleQ.isEmpty()) {
                        sb.append(",");
                    }
                }
            }
            sb.append("]").append("\n");
        }

        System.out.print(sb.toString());
    }
}
