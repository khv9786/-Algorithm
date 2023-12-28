class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] sign = {"+", "-", "*"};
        String[] split = binomial.split(" ");
        int num1 = Integer.parseInt(split[0]);
        String s = split[1];
        int num2 = Integer.parseInt(split[2]);
        int temp = 0;
        for (int i = 0; i < 3; i++) {
            if (sign[i].equals(split[1])) {
                temp = i;
            }
        }

        switch (temp) {
            case 0:
                answer = num1 + num2;
                break;

            case 1:
                answer = num1 - num2;
                break;

            case 2:
                answer = num1 * num2;
                break;
        }

        return answer;
    }
}