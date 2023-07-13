import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int []dp = new int[X+1]; // dp[]는 X를 1로 만드는 최소한의 수 배열
        //logic
        for(int i=2; i<= X; i++) { 
            dp[i] = dp[i-1] + 1; // 이전보다 + 1
            if(i % 2 == 0){        // 2로 나누어 진다면.
                dp[i] = Math.min(dp[i], dp[i/2] + 1); // i/2 +1과 비교해서 대입.
            }
            if(i % 3 == 0) {     // 3으로 나누어 진다면
                dp[i] = Math.min(dp[i], dp[i/3] + 1); // i/3 +1과 비교해서 대입.
            }
        }
        //output
        System.out.print(dp[X]);
    }
}