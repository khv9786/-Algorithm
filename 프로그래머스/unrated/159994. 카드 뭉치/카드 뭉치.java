class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "";
        int a = 0;
        int k = 0;
        int j = 0;
        
        for (int i = 0; i < goal.length; i++) {
            if (goal[i].equals(cards1[k])) {
                a++;
                if (k < cards1.length - 1) {
                    k++;
                }
            } else if (goal[i].equals(cards2[j])) {
                a++;
                if (j < cards2.length - 1) {
                    j++;
                }
            } else {
                break;
            }
        }
        
        answer = (a == goal.length) ? "Yes" : "No";
        return answer;
    }
}
