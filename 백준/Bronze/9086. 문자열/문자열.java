import java.io.*;
import java.util.*;

public class Main { // 문자열
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            sb.append(s.charAt(0)).append(s.charAt(s.length()-1)).append("\n");
        }

        System.out.println(sb);
    }
}
