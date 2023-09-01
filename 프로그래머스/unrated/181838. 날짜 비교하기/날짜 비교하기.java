class Solution {
    public int solution(int[] date1, int[] date2) {
        int answer = 0;
        
        for(int i = 0; i<3; i++){
            if(date2[i] > date1[i]){
                answer = 1;
                break;
            }else if(date2[i] < date1[i]){
                answer = 0;
                break;
            }
        }
        
        return answer;
    }
}