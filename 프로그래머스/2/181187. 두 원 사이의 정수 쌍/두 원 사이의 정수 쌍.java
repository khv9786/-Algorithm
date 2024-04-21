class Solution {
    public long solution(int r1, int r2) {
        long answer = 0;
        
        for( int i = 1; i <= r2 ; i++){
            // 피타고라스로 외부 원 y 최대값 계산.
            double y2 = Math.sqrt(Math.pow(r2,2) - Math.pow(i,2));
            // 내부 원 y 최대값 계산
            double y1 = Math.sqrt(Math.pow(r1,2) - Math.pow(i,2));
            answer += ((long)y2 - (long)Math.ceil(y1) + 1);
            // 소수점 제거 후, 내부 원보다 크고, 내부 원보다 작은 값 더해줌.
        
        }
        answer *= 4;
        
        return answer;
    }
}