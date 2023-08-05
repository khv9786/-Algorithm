import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Stack<Integer> Dont_miss = new Stack<>();
        int answer = 0;
        int k;
        for (int i = 0; i < N; i++) {
            k = sc.nextInt();
            if(k == 0) {
            	Dont_miss.pop();            	
            }else {
            	Dont_miss.push(k);
            }
            
        }
        sc.close();

        // Logic
        while(!Dont_miss.isEmpty()){
        	answer += Dont_miss.pop();
        }
        
        //output
        System.out.println(answer);
    }
}
