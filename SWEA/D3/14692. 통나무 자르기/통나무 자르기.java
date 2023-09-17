import java.util.Scanner;

class Solution {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        //input
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            String answer = "Bob";
            
       //logic
            if(N % 2 == 0){ // 결국 짝수를 가져가는 사람이 이김.
                answer = "Alice";
            }
            //output
            System.out.printf("#%d %s%n",test_case, answer);
    	}
	}
}