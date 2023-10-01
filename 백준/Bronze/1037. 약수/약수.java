import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        

        int n = Integer.parseInt(bf.readLine());
        int answer;
        
        // Input
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int[] numbers = new int[n];
        
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(st.nextToken());
        }
        
        Arrays.sort(numbers);
        answer = numbers[0] * numbers[numbers.length - 1];

        bw.write(Integer.toString(answer));

        bw.flush();
        bw.close();
    }
}
