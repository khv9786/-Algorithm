class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[arr.length];
         int idx = 0;
         for (int element : arr) {
            answer[idx++] = element;
         }
        for(int i = 0; i<queries.length; i++){
            int a = queries[i][0];
            int b = queries[i][1];
            for(int j = a; j<=b; j++){
                answer[j]++;
            }
        }
        
        return answer;
    }
}