import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double [] Math = new double [N];
        
        for(int i = 0; i<N; i++) {
            Math[i] = sc.nextDouble();
        }
        
        Arrays.sort(Math);
        
        double sum = 0;
        
        //logic
        for(int i = 0; i<Math.length; i++) {
        	sum += Math[i] / Math[Math.length-1] * 100;       			 
        }
        
        
        //output
        	System.out.print(sum/N);
     
    }
}