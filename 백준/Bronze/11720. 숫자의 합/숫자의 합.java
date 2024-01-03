import java.util.*;
import java.io.*;
public class Main { // 11720번 숫자의 합
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        String s = br.readLine();
        int answer = 0;
        for(int i = 0; i < N; i++) {
          answer += (s.charAt(i)-'0');
        }
        System.out.println(answer);

    }
}