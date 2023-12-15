class Solution {
    public int[] solution(int num, int total) {
        int[] answer = new int [num];
        int mid = 0;
        int start = 0;
        if(num % 2 != 0){
            mid = total / num;
            start = mid - (num/2);
        }else{
            mid = total*2 / num;
            int num1 = (mid-1)/ 2;
            start = num1 - ((num-2)/2);
        }
        
        
        for(int i = 0; i<num; i++){
            answer[i] = start;
            start++;
        }
        
        return answer;
    }
}