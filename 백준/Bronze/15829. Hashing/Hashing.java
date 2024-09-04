import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String text = br.readLine();
        int answer = 0;

        for (int i = 0; i < text.length(); i++) {
            char now = text.charAt(i);
            int hash = now - 'a' + 1;
            int temp = (int) Math.pow(31, i);
            answer += temp * hash;
        }

        System.out.println(answer);
    }
}
