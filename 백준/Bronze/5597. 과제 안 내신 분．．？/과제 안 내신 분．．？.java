import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int [] stu = new int [31];
        int a = 0;
        
        for(int i = 0; i<28; i++) {
        	int N = sc.nextInt();
        	stu[N] = 1;
        }
        //logic
        int [] no = new int [2];
        for(int j = 1; j < 31; j++) {
        	if(stu[j] == 0) {
        		no[a] = j;
        		a++;
        	}
        }
        Arrays.sort(no);
        //output
        
        System.out.println(no[0]);
        System.out.println(no[1]);
        
        
        
    }
}