import java.io.*;
import java.util.*;

public class Main { // Boj_2293_동전 1
    public static int n,k,answer;

// *      1   2   3   4   5   6   7   8   9   10
// * 1    1   1   1   1   1   1   1   1   1   1
// * 2    0   1   1   2   2   3   3   4   4   5
// * 5    0   0   0   0   1   1   2   2   3   4
// 중복을 피해야함.

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st= new StringTokenizer(br.readLine());

        n =  Integer.parseInt(st.nextToken());
        k =  Integer.parseInt(st.nextToken());
        answer = 0;
        int [] coin = new int[n+1];
        int [] dp = new int[k+1];
        for (int i=1; i<=n; i++) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(coin);
        dp[0] = 1;
        for(int i = 1; i<=n; i++){
            for(int j = coin[i]; j<=k; j++ ){
                dp[j] += dp[j - coin[i]];
            }
        }

        System.out.println(dp[k]);
    }
}