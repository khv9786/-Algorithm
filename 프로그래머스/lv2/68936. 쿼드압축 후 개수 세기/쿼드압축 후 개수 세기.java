class Solution {
    static int[] answer;
    static int[][] arr;  
    
    public int[] solution(int[][] inputArr) {
        arr = inputArr;   
        answer = new int[2];
        int size = arr.length;
        
        find(0, 0, size);        
        return answer;
    }
    
    public static void find(int x, int y, int size) {
        boolean chk = true;
    	
    	for (int i = 0; i < size; i++) {
    		for (int j = 0; j < size; j++) {
    			if ((arr[x][y] - arr[x + i][y + j]) != 0) {
    				chk = false;
    				break;
    			}
    			if (chk == false) {
    				break;
    			}
    		}
    	}
    	
    	if (chk) {
    		if (arr[x][y] == 0) {
    			answer[0]++;
    		} else {
    			answer[1]++;
    		}
    	} else {
    		find(x + size / 2, y, size / 2);
    		find(x, y, size / 2);
    		find(x + size / 2, y + size / 2, size / 2);
    		find(x, y + size / 2, size / 2);
    	}
    }
}
