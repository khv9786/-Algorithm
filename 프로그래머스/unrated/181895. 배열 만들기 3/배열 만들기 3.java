class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int length = (intervals[0][1] - intervals[0][0] + 1) + (intervals[1][1] - intervals[1][0] + 1);
        
        int[] answer = new int [length];
        int a = 0;
        
        for(int i = intervals[0][0]; i <= intervals[0][1]; i++){
            answer[a] = arr[i];
            a++;
        }
        for(int i = intervals[1][0]; i <= intervals[1][1]; i++){
            answer[a] = arr[i];
            a++;
        }
        
        return answer;
    }
}