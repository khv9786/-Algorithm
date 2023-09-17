import java.util.*;
class Solution
{
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);

       int T = sc.nextInt();
        for(int tc = 1; tc <= T ; tc++){
             int answer = 1;
			String N = sc.next(); 
			for(int i = 0; i<=N.length()/2; i++){
            	if(N.charAt(i) != N.charAt(N.length()-i-1)){
                	answer = 0;
                    break;
            }
        }
            
		// output
        System.out.printf("#%d %d%n",tc, answer);

		}
    }
}