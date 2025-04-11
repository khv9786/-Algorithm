class Solution {
    public int solution(int n, int w, int num) {
        int answer = ((n - num) / (2 * w)) * 2 + 1;
        // 2w 마다 반복.
        int cycleNum = (num - 1) % (2 * w);
        int cycleN = (n - 1) % (2 * w);
        int lineNum = cycleNum / w;
        int lineN = cycleN / w;

        if (lineNum == lineN) {
            if (cycleNum > cycleN) answer++;
        } else {
            if (cycleNum + cycleN >= (2 * w - 1)) answer++;
        }

        return answer;
    }
}
