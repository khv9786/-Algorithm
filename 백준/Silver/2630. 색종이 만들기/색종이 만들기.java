import java.util.*;
import java.util.Scanner;


public class Main {
	
    	static int [][] paper ;
    	static int blue = 0;
    	static int white = 0;
    	
    public static void main(String[] args) {
        // Input
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        paper = new int[N][N];
        
        for(int i = 0; i<paper.length; i++) {
        	for(int j = 0 ; j<paper[i].length; j++) {
        		paper[i][j] = sc.nextInt();
        	}
        }

       
        //output
        div(0,0,N); // do function
        System.out.println(white);
        System.out.println(blue);
        
    }
    //logic - recursion fuc
    public static void div(int x,int y, int n) { 
    	boolean chk = true;
    	for(int i =0; i<n ; i++) {
    		for(int j = 0; j<n; j++) {
    			if( (paper[x][y] - paper[x+i][y+j]) != 0 ) {
    				chk = false;
    				break;
    			}
    			if(chk == false) {
    				break;
    			}
    		}
    	}
    	
    	if(chk) {
    		if(paper[x][y] == 0) {
    			white ++;
    		}else {
    			blue ++;
    		}
    	}else {
    		div(x + n/2, y, n/2);
    		div(x,y,n/2);
    		div(x + n/2, y + n/2, n/2);
    		div(x, y + n/2, n/2);
    	}
    	
    	
    	
    }
}

//n의 길이에서 쪼개면 n/2
//(x + n/2, y) (x,y) / (x+n/2,y+n/2) / (x,y+ n/2) 4가지로 재귀
