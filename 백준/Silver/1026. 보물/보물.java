import java.util.Scanner;
import java.util.*;
public class Main {
	public static void main(String[] args) {
		// Input
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int [] arr = new int[N];
		int [] arr2 = new int[N];
		int answer = 0;
		
		for(int i = 0; i<N; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i<N; i++) {
			arr2[i] = sc.nextInt();
		}
		//Logic
		Arrays.sort(arr);
		Arrays.sort(arr2);
		
		for(int i = 0; i<N; i++) {
			answer += arr[i]*arr2[N-1-i];
		}
		

		// Output
		System.out.println(answer);
	}
}
