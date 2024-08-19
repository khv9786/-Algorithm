import java.io.*;
import java.util.*;

public class Main { // 최소 힙
    public static int N;
    public static Set<Integer> set = new HashSet<>();
    public static StringBuilder sb = new StringBuilder();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        PriorityQueue<Integer> Pq = new PriorityQueue<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int now = Integer.parseInt(st.nextToken());
            if(now == 0){
                if(Pq.isEmpty()){
                    sb.append("0").append("\n");
                }else{
                    sb.append(Pq.poll()).append("\n");
                }
            }else{
                Pq.add(now);
            }
        }

        System.out.print(sb.toString());
    }
}
