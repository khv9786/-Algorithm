import java.io.*;
import java.util.*;

public class Main { // Boj_28446_볼링공 찾아주기
    public static int M; // 동굴 길이, 높이
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        HashMap<Integer, ArrayList<Integer>> bowl = new HashMap<>();
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int command = Integer.parseInt(st.nextToken());
            if (command == 1) {
                int x = Integer.parseInt(st.nextToken());
                int w = Integer.parseInt(st.nextToken());
                bowl.put(w,new ArrayList<>());
                bowl.get(w).add(x);
            } else if(command == 2){
                int w = Integer.parseInt(st.nextToken());
                ArrayList<Integer> positions = bowl.get(w);
                if (positions != null) {
                    for (int pos : positions) {
                        sb.append(pos).append("\n");
                    }
                }
            }
        }
        System.out.println(sb);
    }
}