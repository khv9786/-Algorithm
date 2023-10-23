import java.util.Scanner;

public class Main {// 13458 시험 감독 - 구현 28%
  

    public static void main(String[] args) {// 1926 그림 41%
    	Scanner sc = new Scanner(System.in);
    	
    	int N = sc.nextInt(); // 시험장 수
    	int [] A = new int [N]; 
    	for(int i = 0; i<N; i++) {
    		A[i] = sc.nextInt(); // 응시자 수       	
    	}
    	int B = sc.nextInt(); // 총 감독관
    	int C = sc.nextInt(); // 부 감독관
    	long answer = N;
    	for(int i = 0; i < N; i++) {
    		A[i] -= B;
    		while(A[i] > 0) {
    			int tmp = A[i] / C;    			
    			if(A[i] <= C) {
    				A[i] -= C;
    				answer++;
    				break;
    			}
    			A[i] %= C;
    			answer += tmp;
    		}
    	}
    	System.out.println(answer);
    	
    }
}
