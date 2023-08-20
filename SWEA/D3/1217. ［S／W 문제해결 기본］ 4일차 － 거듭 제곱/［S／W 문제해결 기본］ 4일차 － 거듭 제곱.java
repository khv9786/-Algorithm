import java.util.*;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //logic
        for (int i = 0; i < 10; i++) {
            
            int T = sc.nextInt();
            int N = sc.nextInt();
            int M = sc.nextInt();
            int answer = N;
            
           while(M > 1) {
        	   answer *= N;
        	   M --;
           }
            
        	
        	//output
            System.out.printf("#%d %d\n", T, answer);
        }

        sc.close();
    }
}
