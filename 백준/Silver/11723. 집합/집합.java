import java.io.*;
import java.util.*;

public class Main { // 집합 - 비트마스킹
    public static int M;
    public static int bitSet = 0; 
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        M = Integer.parseInt(br.readLine());

        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("all")) {
                bitSet = (1 << 20) - 1; 
            } else if (cmd.equals("empty")) {
                bitSet = 0;
            } else {
                int x = Integer.parseInt(st.nextToken()) - 1; // 19까지 사용
                switch (cmd) {
                    case "add":
                        bitSet |= (1 << x);
                        break;
                    case "remove":
                        bitSet &= ~(1 << x);
                        break;
                    case "check":
                        sb.append((bitSet & (1 << x)) != 0 ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        bitSet ^= (1 << x);
                        break;
                }
            }
        }

        System.out.print(sb.toString());
    }
}
