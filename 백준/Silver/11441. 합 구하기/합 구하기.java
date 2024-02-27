import java.io.*;
import java.util.StringTokenizer;

public class Main {// Boj_11441_운동
    // 누적합
    public static int N,A,M,start,end;
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        N = Integer.parseInt(st.nextToken());
        arr = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i<=N; i++){
            A = Integer.parseInt(st.nextToken());
            arr[i] = arr[i-1] + A;
        }
        M = Integer.parseInt(br.readLine());
        for(int i = 0; i<M; i++){
            st = new StringTokenizer(br.readLine());
            start = Integer.parseInt(st.nextToken());
            end = Integer.parseInt(st.nextToken());
            sb.append(arr[end] - arr[start-1]);
            sb.append("\n");
        }


        System.out.println(sb);
    }
}
