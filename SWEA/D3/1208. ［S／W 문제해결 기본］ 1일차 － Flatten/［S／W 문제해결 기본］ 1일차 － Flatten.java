
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		  Scanner sc = new Scanner(System.in);
	        for(int i = 0; i<10; i++) {
	            int N = sc.nextInt();
	            int [] arr = new int [100];
	            for(int k = 0; k < 100; k++) {            	
	            	arr[k]= sc.nextInt();           	
	            }
	          //logic
	            for(int k = 0; k < N; k++) {
	            	Arrays.sort(arr);
	            	if(arr[0] == arr[arr.length-1]) {
	            		break;
	            	}else {
	            		arr[0] ++;
		            	arr[arr.length-1] --;
	            	}
	            }
	            Arrays.sort(arr);
	          	int answer = arr[arr.length-1]-arr[0];
	          	
	          	//output
	            System.out.printf("#%d %d\n",i+1,answer); 
	        }sc.close();
	}
}