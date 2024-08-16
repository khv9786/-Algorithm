import java.io.*;
import java.util.*;

public class Main { // 숫자 카드 2
    public static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        Map<Integer, Integer> set = new HashMap<>();

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<N; i++){
            int temp = Integer.parseInt(st.nextToken());
            set.put (temp,set.getOrDefault(temp, 0) + 1 );
        }

        st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i = 0; i<M; i++){
            int temp = Integer.parseInt(st.nextToken());
            if(set.get(temp) == null){
                sb.append(0).append(" ");
            }else{
                sb.append(set.get(temp)).append(" ");
            }
        }

        System.out.println(sb);
    }
}
