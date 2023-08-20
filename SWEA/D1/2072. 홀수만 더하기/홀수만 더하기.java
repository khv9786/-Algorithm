import java.util.*;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        // Logic
        for (int i = 0; i < T; i++) {
            int answer = 0;
            for(int j = 0; j < 10; j++) { 
                int a = sc.nextInt();
                if(a % 2 != 0){
                    answer += a;
                }
            }
            
            // Output
            System.out.printf("#%d %d\n", i + 1, answer);
        }

        sc.close();
    }
}
