import java.io.*;
import java.util.*;

public class Main { // S1 곱셈
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        System.out.println(recursion(A, B, C));
    }

    private static long recursion(long A, long B, long C) {
        if (B == 0) return 1;
        long temp = recursion(A, B / 2, C);
        temp = (temp * temp) % C;
        if (B % 2 != 0) {
            temp = (temp * A) % C;
        }
        return temp;
    }
}