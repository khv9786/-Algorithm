import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int ac = 0;
        int [] T = new int[N];
        int [] P = new int[N];
        int [] dp = new int[N+1];
        
        for(int i = 0; i<N; i++) {
        	T[i] = sc.nextInt();
        	P[i] = sc.nextInt();
        }
        
        
        sc.close();
               
        //logic
        for(int i = 0; i<N; i++) {
        	if(i + T[i] <= N) { // 날짜가 오버되지 않게
        		dp[i + T[i]] = Math.max(dp[i + T[i]],dp[i]+P[i]);
        	}
        		
        	dp[i+1] = Math.max(dp[i+1], dp[i]);
        		
        }

        //output
        	System.out.print(dp[N]);
     
    }
}