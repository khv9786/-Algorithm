import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [] balls = new int[N];
        for(int i =0; i<N; i++) {
        	balls[i] = i+1;
        }
        //logic
        
        for(int k = 0; k < M; k++) {
        	int i = sc.nextInt() -1;
        	int j = sc.nextInt() -1;
        	int a = 0;
        	a = balls[i];
        	balls[i] = balls[j];
        	balls[j] = a;
        }

        //output
        for(int s : balls) {
        	System.out.print(s+" "); 
        }
        
    }
}