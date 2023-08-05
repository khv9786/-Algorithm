import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int [] coin = new int[N];
        int answer = 0;

       
        for (int i = 0; i < N; i++) {
            coin[i] = sc.nextInt();            
        }
        sc.close();

        // Logic

               
        for(int j = coin.length -1; j>=0; j--) {
        	if(K >= coin[j]) {
        		while(K >= coin[j]) {
        			K -= coin[j];
        			answer ++;
        		}       	
        	}
        	
        	if(K == 0) {
        		break;
        	}
        }
        
        //output
        System.out.println(answer);
    }
}
