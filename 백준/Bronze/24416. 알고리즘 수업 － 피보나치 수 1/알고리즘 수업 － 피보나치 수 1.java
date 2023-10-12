import java.util.*;

public class Main { // 24416 알고리즘 수업 - 피보나치 수 1
	static int [] f;
	static int answer;
	static int answer2;
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        //input
        int n = sc.nextInt();
        f = new int[n+1]; // 숫자로 사용하기 위함
        fib(n);
        dp_fib(n);

        System.out.println(answer+" "+ answer2);
        sc.close();
    }
 public static int fib(int n) {
	 if(n == 1 || n == 2) {
		 answer ++;
		 return 1;
	 }else {
		 return(fib(n-1) + fib(n-2));		 
	 }
 }
 
 public static int dp_fib(int n) {
	 f[1] = f[2] = 1;
	 for(int i = 3; i<=n; i++) {
		 answer2 ++;
		 f[i] = f[i-1] + f[i-2];
	 }return f[n];
 }
    
}
