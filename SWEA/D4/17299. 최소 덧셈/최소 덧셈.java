import java.util.*;

class Solution { // 17299. 최소 덧셈 D4

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();

        for (int test_case = 1; test_case <= T; test_case++) {
            int answer = 0; 
            
            // Input
            String N = sc.nextLine();
            int length = N.length();
            // Logic
            if(length % 2 == 0) {
            	String s1 = N.substring(0,length/2);
            	String s2 = N.substring(N.length()/2,length);
            	
            	int a = Integer.parseInt(s1);
            	int b = Integer.parseInt(s2);
            	
            	answer = a + b;
            }else if(length % 2 != 0){ // if length ->5, 2,3과 3,2 비교
            	String s1 = N.substring(0,length/2); // 2
            	String s2 = N.substring(length/2,length);
            	
            	int a = Integer.parseInt(s1);
            	int b = Integer.parseInt(s2);
            	int tmp1 = a+b;
            	
            	String s3 = N.substring(0,length/2 + 1);
            	String s4 = N.substring(length/2 + 1,length);
            	
            	int c = Integer.parseInt(s3);
            	int d = Integer.parseInt(s4);
            	int tmp2 = c+d;
            	
            	answer = Math.min(tmp1,tmp2);
            }
            // Output
            System.out.printf("#%d %d%n", test_case, answer);
            
        }
        sc.close();
        
    
    }
}