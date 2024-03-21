import java.io.*;
import java.util.*;

public class Main {
    static class Pair {
        int first, second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }

        // Implement equals and hashCode if you plan to use contains on a list of Pairs.
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Pair pair = (Pair) o;
            return first == pair.first && second == pair.second;
        }
    }

    static int cmp(Pair a, Pair b) {
        if (a.first == b.first) {
            return Integer.compare(b.second, a.second); // Note the order for descending
        }
        return Integer.compare(a.first, b.first);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<Pair> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            a.add(new Pair(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        a.sort(Main::cmp);

        int m = Integer.parseInt(br.readLine());
        List<Pair> b = new ArrayList<>();

        for (int i = 0; i < m; i++) {
            String[] input = br.readLine().split(" ");
            b.add(new Pair(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        b.sort(Comparator.comparingInt((Pair p) -> p.first).thenComparingInt(p -> p.second));

        int x = a.get(0).first;
        int y = a.get(0).second;

        for (int i = 0; i < m; i++) {
            int dx = b.get(i).first - x, dy = b.get(i).second - y;
            boolean flag = false;
            for (Pair pair : a) {
                Pair shifted = new Pair(pair.first + dx, pair.second + dy);
                if (!b.contains(shifted)) {
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                bw.write(dx + " " + dy + "\n");
                bw.flush();
                return;
            }
        }

        bw.close();
    }
}