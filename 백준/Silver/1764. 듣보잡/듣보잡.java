import java.io.*;
import java.util.*;

public class Main { // S4 1764 듣보잡
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        HashSet<String> neverSeen = new HashSet<>();
        HashSet<String> neverHeard = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String name = br.readLine();
            neverSeen.add(name);
        }

        for (int j = 0; j < M; j++) {
            String name = br.readLine();
            neverHeard.add(name);
        }

        neverSeen.retainAll(neverHeard);
        List<String> answer = new ArrayList<>(neverSeen);
        Collections.sort(answer);

        sb.append(answer.size());
        sb.append('\n');
        for (int i = 0; i < answer.size(); i++) {
            sb.append(answer.get(i));
            sb.append('\n');
        }

        System.out.println(sb);
    }
}
