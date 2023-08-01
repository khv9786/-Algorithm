import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int A =sc.nextInt();
        int A1 = sc.nextInt();
        int C  = sc.nextInt();
        int n = sc.nextInt();
        int answer = 0;
        // Logic 
        if(A * n + A1 <= C * n) {
        	if(C >= A) {
        	answer = 1;
        	}
        }else answer = 0;
        
        System.out.println(answer);
        sc.close();
    }
}

// -7n + 30 , 11n
// -7 30
// 11
// 2
// 1`
//
// -4n + 10, -2n
// -4 10
// -2
// 10

//7n -2, 6n
//1
//0
