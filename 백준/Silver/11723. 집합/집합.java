import java.io.*;
import java.util.*;

public class Main { // 집합
    public static int M;
    public static Set<Integer> set = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        M = Integer.parseInt(br.readLine());
        for (int i = 0; i < M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String cmd = st.nextToken();

            if (cmd.equals("all")) {
                for (int j = 1; j <= 20; j++) {
                    set.add(j);
                }
            } else if (cmd.equals("empty")) {
                set.clear();
            } else {
                int x = Integer.parseInt(st.nextToken());

                switch (cmd) {
                    case "add":
                        set.add(x);
                        break;
                    case "remove":
                        set.remove(x);
                        break;
                    case "check":
                        sb.append(set.contains(x) ? "1\n" : "0\n");
                        break;
                    case "toggle":
                        if (set.contains(x)) {
                            set.remove(x);
                        } else {
                            set.add(x);
                        }
                        break;
                }
            }
        }

        System.out.print(sb.toString());
    }
}
