class Solution {
    public int[] solution(int[] num_list, int n) {
        int a = 0;
        if(num_list.length % n != 0){
            a = 1 + num_list.length/n ;}
        else a = num_list.length/n;
        
        int[] answer = new int[a];
        int b = 0;
        for(int i = 0; i<num_list.length; i += n){
            answer[b] = num_list[i];
            b++;
            if (i + n+1 > num_list.length){
                break;
            }
        }
            
        return answer;
    }
}