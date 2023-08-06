
import java.util.*;

class Solution
{
	public static void main(String args[]) throws Exception
	{

		  Scanner sc = new Scanner(System.in);
	        for(int i = 0; i<10; i++) { 		//10 tc
	            int N = sc.nextInt();
	            int [] arr = new int [100];
	            for(int k = 0; k < 100; k++) {  // 가로길이 100   	
	            	arr[k]= sc.nextInt();           	
	            }
	          //logic
	            for(int k = 0; k < N; k++) {
	            	Arrays.sort(arr);			// 먼저 정렬 후
	            	if(arr[0] == arr[arr.length-1] && arr[1] == arr[arr.length-2]) { 
	            		// 평탄하다면 break;
	            		break;
	            	}else {
	            		arr[0] ++;				//최저점 +1
		            	arr[arr.length-1] --;	//최고점 -1
	            	}
	            }
	            Arrays.sort(arr);				// 정렬 후 출력.
	          	int answer = arr[arr.length-1]-arr[0];
	          	
	          	//output
	            System.out.printf("#%d %d\n",i+1,answer); 
	        }sc.close();
	}
}