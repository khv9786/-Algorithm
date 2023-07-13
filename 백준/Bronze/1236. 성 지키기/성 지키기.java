import java.util.*;
 
public class Main {
    public static void main(String[] args){
        //input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        char [][] castle = new char[N][M];
        int row = 0;
        int col = 0;
        
        //logic
        for(int i = 0; i<N; i++) {
        	String str = sc.next();
        	for(int j = 0; j <M; j++) {
        		castle[i][j] = str.charAt(j);
        	}
        }
        
        for(int i = 0; i<N; i++) {
        	boolean X = true;
        	for(int j =0; j<M; j++) {
        		if(castle[i][j] == 'X') { // 해당 행에 경비가 있다면 
        			X = false;
        			break;
        		}
        	}if(X) {row ++;}
        		
        }
        
        for(int i = 0; i<M; i++) {
        	boolean X = true;
        	for(int j =0; j<N; j++) {
        		if(castle[j][i] == 'X') { // 해당 열에 경비가 있다면 
        			X = false;
        			break;
        		}
        	}if(X) {col ++;}
        		
        }
        
        //output
        System.out.println(Math.max(row, col)); // 겹치는경우 적게 나오므로 큰 수를 대입
    }
}