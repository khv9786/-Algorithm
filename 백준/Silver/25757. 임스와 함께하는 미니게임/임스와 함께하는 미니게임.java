import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main { // Boj_25757_임스와 함께하는 미니게임
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        String s = st.nextToken();
        HashSet<String> name = new HashSet<>();
        for (int i = 0; i < N; i++) {
            name.add(br.readLine());
        }
        int people = name.size();
        int div = 0;
        switch (s) {
            case "Y":
                div = 1;
                break;
            case "F":
                div = 2;
                break;
            case "O":
                div = 3;
                break;
        }

        int games = people / div;

        System.out.println(games);
    }
}