import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        String lower_S = S.toLowerCase();
        int [] alpha = new int [26];
        char answer ;
        
        //logic
        for(int i = 0; i<lower_S.length(); i++) {
        	char c = lower_S.charAt(i);
        	alpha[c - 'a']++;
        }
        
    	int max = -1;
    	int temp = 0;
    	boolean duplicate = false;
    	
    	for(int i = 0; i<alpha.length; i++) {
    		if(alpha[i] > max) {
    			max = alpha[i];
    			temp = i;
    			duplicate = false;
        	}else if(alpha[i] == max) {
        		duplicate = true;
        	}
        }
    	
    	if(duplicate == true) {
    		answer = '?';
    	}else answer = (char)(temp + 'A');
        //output
        System.out.println(answer);
         
    }
   
}