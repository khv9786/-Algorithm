class Solution {
    public String solution(int a, int b) {
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] m = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        int answer = 0;
        
        for (int i=0; i<a-1; i++) {
            answer += m[i];
        }
        
        return day[(answer-1 + b)%7];
    }
}