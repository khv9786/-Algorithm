class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        int[] num = new int[n];

        for (int i = 0; i < n; i++) {
            num[i] = arr1[i] | arr2[i];
        }

        for (int i = 0; i < n; i++) {
            StringBuilder row = new StringBuilder();
            int currentNum = num[i];

            for (int j = 0; j < n; j++) {
                if (currentNum % 2 == 1) {
                    row.insert(0, "#");
                } else {
                    row.insert(0, " ");
                }
                currentNum /= 2;
            }

            answer[i] = row.toString();
        }

        return answer;
    }
}
