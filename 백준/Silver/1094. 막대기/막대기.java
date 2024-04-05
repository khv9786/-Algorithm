import java.io.*;
import java.util.*;

public class Main { // Boj_1094_막대기
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double stick = 64;
        double X = Double.parseDouble(st.nextToken());

        int answer = 0;
        while (X > 0) {
            if (stick > X) {
                stick /= 2;
            } else {
                X -= stick;
                answer++;
            }
        }
        System.out.println(answer);
    }
}