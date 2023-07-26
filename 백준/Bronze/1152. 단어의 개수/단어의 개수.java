import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        String S= sc.nextLine();
        int answer = 0;
        //logic
        S = S.replaceAll(" ", "1");
        for(int i = 0; i<S.length(); i++) {
        	char c = S.charAt(i);
        	if(c == '1') {
        		answer ++;
        	}
        }//for

        if(S.charAt(0) == '1' && S.charAt(S.length()-1) == '1') {
        	answer --;
        	if(S.length() == 2) { 
            	answer --;}
        }else if (S.charAt(0) == '1'|| S.charAt(S.length()-1) == '1') {
        }else {
        	answer ++;  	  
        }

        //output
        System.out.println(answer);
         
    }
   
}