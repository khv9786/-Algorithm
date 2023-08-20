import java.util.*;

class Solution {

    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        
        //logic
        for (int tc = 1; tc <= 10; tc++) {
            
            int T = sc.nextInt();
            int [][] rectangle = new int[100][100];
            
            for(int i = 0; i<100; i++) {
            	for(int j = 0; j<100; j++) {
            		rectangle[i][j] = sc.nextInt();
            	}
            }
            
            int answer = 0;
            for(int x = 0; x<rectangle.length; x++) {
            	boolean chk1 = false;
                boolean chk2 = false;
            	for(int y = 0; y<rectangle[x].length; y++) {
            		if(rectangle[y][x] == 1 && !chk1) { // 1이고, 1이 나온적 없을 때
            			chk1 = true;
            		}else if(rectangle[y][x] == 2 && chk1) { // 2이고, 1이 나왔었을 때
            			chk1 = false;
            			answer ++;
            		}
            	}
            }
                    	
        	//output
            System.out.printf("#%d %d\n", tc, answer);
        }

            sc.close();
        }
    }
