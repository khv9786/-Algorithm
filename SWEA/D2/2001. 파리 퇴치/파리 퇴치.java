import java.util.*;

class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        //input
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt(); 
            int M = sc.nextInt(); 
            int [][] map = new int [N][N];           
            int answer = 0;
            
            for(int i = 0; i<N; i++) {
            	for(int j = 0; j<N; j++) {
            		map[i][j] = sc.nextInt();
            	}
            }
            
            //logic
            for (int i = 0; i<= N - M; i++) {
            	for (int j = 0; j <= N - M; j++) {
            		int sum = 0;
            		for (int x = 0; x < M; x++) {
            			for (int y = 0; y < M; y++) {
            				sum += map[i + x][j + y];
            			}
            		}
            		answer = Math.max(sum, answer);
            	}
            }

            // 3. Output
            System.out.printf("#%d %d%n", test_case, answer);
        }
    }
}
