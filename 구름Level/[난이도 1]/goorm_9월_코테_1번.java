import java.io.*;
import java.util.*;

public class goorm_9월_코테_1번 { // 코테, [난이도 1] 타임 세일
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());
        if( B > C){
            System.out.println("No");
        }else{
            System.out.println("Yes");
        }

    }
}
