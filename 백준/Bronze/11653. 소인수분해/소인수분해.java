import java.util.*;

public class Main {
    public static void main(String[] args) {
        // input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        // logic
        while(N >= 2) {
        	for(int i = 2; i<=N; i++) {
        		if(N%i == 0) {
        			int a= 0;
        			for(int j=1; j<=i; j++) {
        				if(i % j == 0) {
        					a++;
        				}
        				if( a>2 ) {
        					break;
        				}
        			}if(a == 2) {
        				list.add(i);
        				N /= i;
        			}
        		}//1_if
        	}//1_for
        }//while
        Collections.sort(list);
        sc.close();
        
        //output
        Collections.sort(list);
        for(int temp : list) {
        	System.out.println(temp);
        }
    }
}
