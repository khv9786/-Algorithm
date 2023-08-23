class Solution {
    public int solution(int[] rank, boolean[] attendance) {
        int answer = 0;
        int p = rank.length;
        
        for(int i = 0; i <attendance.length; i++){
            if(!attendance[i]){
                rank[i] = 101;
                p --;
            }
        }
        
        int [] top3 = new int[3];
        int a = 0;
        for(int k = 0; k <3; k++){
            int min = 101;
            int stu = 0;
            
             for(int i=0; i<rank.length; i++){
                if(rank[i] < min){
                   min = rank[i];
                   stu = i;
                }
            }
            rank[stu] = 101;
            top3[a] = stu;
            a++;
            
        }
        
        answer = top3[0] * 10000 + top3[1] * 100 + top3[2];
        
        return answer;
    }
}