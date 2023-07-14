import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String winner = "";
        int [] dp = new int[N+3];
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 1;

        //logic
        
        for(int i = 1; i < N+1; i++) {
        	if(i > 3)dp[i] = Math.min(dp[i-1],dp[i-3])+ 1; //1과 3중 적은거 선택.
        }
        if(dp[N] % 2 == 0) {
        	winner ="CY";
        }else winner = "SK";
  
        //output
        System.out.println(winner); 
    }
}