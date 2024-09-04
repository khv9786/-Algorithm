import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int cnt = 1;
        int now = 1;
        // 1, 7, 19, 37, 61 6씩 증가.
        while(true){
            if(now >= N){
                break;
            }
            now += cnt * 6;
            cnt ++;
        }

        System.out.println(cnt);
    }
}
