
import java.io.*;
import java.util.*;

public class goorm_9월_코테_2번 { // 코테, [난이도 2] 시간 복잡도
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Long.parseLong(st.nextToken());

        // 2의 약수, 5의 약수 판별해야함. 5의 빈도수가 적으므로 5로 책정
        long cnt = 0;
        while (N >= 5) {
            N /= 5;
            cnt += N;
        }
        System.out.println(cnt);

    }
}

