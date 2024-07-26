import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int answer = 0;
        int N = Integer.parseInt(br.readLine());
        int me = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQ = new PriorityQueue<>(Comparator.reverseOrder());
        
        for (int i = 1; i < N; i++) {
            pQ.add(Integer.valueOf(br.readLine()));
        }
        
        while(!pQ.isEmpty() && pQ.peek() >= me){
            int other = pQ.poll();
            me ++;
            other --;
            pQ.add(other);
            answer ++;
        }

        System.out.println(answer);
    }
}
