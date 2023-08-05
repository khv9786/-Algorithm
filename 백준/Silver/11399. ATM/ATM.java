import java.util.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] atm = new int[N];
        int answer = 0;
        int temp = 0;
       
        for (int i = 0; i < N; i++) {
            atm[i] = sc.nextInt();            
        }
        sc.close();

        // Logic
        Arrays.sort(atm);
        
        
        for(int j = 0; j<atm.length; j++) {
        	temp += atm[j];       	
        	answer += temp;
        }
        
        //output
        System.out.println(answer);
    }
}
