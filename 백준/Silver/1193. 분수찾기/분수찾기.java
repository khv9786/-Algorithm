import java.util.*;
import java.util.Scanner;


public class Main {
   	
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int answer = 0;
    	int count = 0;
		int i = 1;
		int deno = 0;
		int numer = 0;
        //logic 
        // 짝수번째 -> 분자 ++, 홀수번째 분모증가.
		// 1 2 3 4 5 ~ 대각선 결정
		while(count < N) {
			count += i;
			i++;
		}
        
		if((i-1)%2 == 0) {
			deno = 1 + (count - N);
			numer = (i-1) - (count-N);
		}else {
			deno = (i-1) - (count-N);
			numer = 1 + (count - N);
		}
          	//output
			System.out.println(numer  + "/" + deno);
        }
             	
}

  
