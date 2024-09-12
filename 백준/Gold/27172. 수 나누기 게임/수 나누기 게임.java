import java.io.*;
import java.util.*;

public class Main { // 수 나누기 게임
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        int[] score = new int[1000001];
        boolean[] hasCard = new boolean[1000001]; 

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            hasCard[arr[i]] = true;
        }

        for (int i = 0; i < N; i++) {
            int card = arr[i];
            for (int j = 2 * card; j <= 1000000; j += card) { 
                if (hasCard[j]) {
                    score[card]++;
                    score[j]--;
                }
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(score[arr[i]]).append(" ");
        }

        System.out.println(sb);
    }
}
