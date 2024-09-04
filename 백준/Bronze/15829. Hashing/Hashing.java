import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        String text = br.readLine();
        long answer = 0;
        long mod = 1234567891;
        long pow = 1; 

        for (int i = 0; i < text.length(); i++) {
            char now = text.charAt(i);
            int hash = now - 'a' + 1;

            answer = (answer + hash * pow) % mod; 
            pow = (pow * 31) % mod;  
        }

        System.out.println(answer);
    }
}
