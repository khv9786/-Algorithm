import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        String S= sc.nextLine();
        int [] answer = new int [26];
        Arrays.fill(answer, -1);
               
        //logic
        for(int i = 0; i<S.length(); i++) {
        	char alpha = S.charAt(i);
        	if(answer[alpha - 'a'] == -1) {
        		answer[alpha - 'a'] = i; 
        	}
        }
        
        
        //output
        for(int a : answer) {
        	System.out.print(a + " ");
        }            
    }
   
}