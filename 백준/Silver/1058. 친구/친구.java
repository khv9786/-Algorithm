import java.io.*;
import java.util.StringTokenizer;

public class Main { // Boj_1058_친구
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean arr[][] = new boolean[N][N];
        int [][] friend = new int [N][N];
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'Y') {
                    arr[i][j] = true;
                }
            }
        }
        for (int k = 0; k < N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(i == j) continue;
                    if(arr[i][j] || arr[i][k] && arr[k][j]){
                        friend[i][j] = 1;
                    }
                }
            }
        }
        int answer = 0;
        for(int i = 0; i<N; i++){
            int max = 0;
           for(int j = 0; j<N; j++){
               max += friend[i][j];
           }
            answer = Math.max(answer,max);
        }

        System.out.println(answer);
    }
}