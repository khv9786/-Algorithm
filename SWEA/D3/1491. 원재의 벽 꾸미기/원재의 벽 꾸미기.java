import java.util.*;

class Solution {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T;
        T = sc.nextInt();
        //input
        for (int test_case = 1; test_case <= T; test_case++) {
            long N = sc.nextInt(); 
            long A = sc.nextInt();
            long B = sc.nextInt();                       
            long min = Long.MAX_VALUE;
            long temp = 0;
            //logic
            for(int R = 1; R<=N/2; R++) {
            	for(int C = 1; C * R<=N; C++) {
            		temp = A * Math.abs(R-C) + B *(N-R*C);
            			min = (min > temp) ? temp : min;           		
            	}
            }
            

            // 3. Output
            System.out.printf("#%d %d%n", test_case, min);
            
        }sc.close();
    }
}
