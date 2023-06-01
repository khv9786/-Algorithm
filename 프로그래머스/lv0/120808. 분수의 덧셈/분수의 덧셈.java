class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        
        int top = numer1 * denom2 + numer2 * denom1; // 분자 계산
        int bottom = denom1 * denom2; // 분모 계산
        
        int gcd = gcd(top, bottom); // 최대공약수 계산
        
        answer[0] = top / gcd;
        answer[1] = bottom / gcd;
        
        return answer;
    }
    

    private int gcd(int a, int b) {
        if (a % b == 0) {
            return b;
        } else {
            return gcd(b, a % b);
        }
    }
}