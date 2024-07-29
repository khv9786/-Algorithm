import java.io.*;
import java.util.*;

public class Main { // 1764 듣보잡 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> neverSeen = new HashSet<>();
        List<String> names = new ArrayList<>();

        for (int i = 0; i < N; i++) {
            neverSeen.add(br.readLine());
        }

        for (int j = 0; j < M; j++) {
            String name = br.readLine();
            if (neverSeen.contains(name)) {
                names.add(name);
            }
        }

        Collections.sort(names);

        sb.append(names.size()).append('\n');
        for (String name : names) {
            sb.append(name).append('\n');
        }

        System.out.print(sb);
    }
}