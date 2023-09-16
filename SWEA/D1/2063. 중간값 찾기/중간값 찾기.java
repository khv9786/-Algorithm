
import java.util.*;


class Solution
{
	public static void main(String args[]) throws Exception
	{

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt(); // 199
        int [] arr = new int[N];
        int answer = 0;
        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
		}
        
        Arrays.sort(arr);
        if(N > 1){
        answer =arr[(N / 2) ];
        
        }else { answer = arr[0]; }
        System.out.printf("%d",answer);
        
		            
            
            

	}
}