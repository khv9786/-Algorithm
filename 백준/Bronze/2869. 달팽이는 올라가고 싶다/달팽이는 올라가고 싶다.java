import java.io.*;
import java.util.*;

public class Main { // 달팽이는 올라가고 싶다
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        Long A = Long.parseLong(st.nextToken());
        Long B = Long.parseLong(st.nextToken());
        Long V = Long.parseLong(st.nextToken());

        Long answer = 0L;

        if ((V - B) % (A - B) != 0) {
            answer = ((V - B) / (A - B)) + 1;
        } else if ((V - B) % (A - B) == 0) {
            answer = (V - B) / (A - B);
        }

        System.out.println(answer);
    }
}