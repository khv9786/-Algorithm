import java.io.*;
import java.util.*;

public class Main {// S1 IOIOI
    public static int N;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        char[] S = br.readLine().toCharArray();

        int result = 0;
        int count = 0;
        boolean chk = false;

        for (int i = 0; i < M - 1; i++) {
            if (S[i] == 'I') {
                chk = true;
                count = 0;
                while (chk && i < M - 1) {
                    if (S[i + 1] == 'O' && i + 2 < M && S[i + 2] == 'I') {
                        count++;
                        if (count == N) {
                            result++;
                            count--;
                        }
                        i += 2;
                    } else {
                        chk = false;
                    }
                }
            }
        }

        System.out.println(result);
    }
}