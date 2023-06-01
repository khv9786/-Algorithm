class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];

        for (int i = 0; i < quiz.length; i++) {
            String[] expr = quiz[i].split(" ");
            int x = Integer.parseInt(expr[0]);
            int y = Integer.parseInt(expr[2]);
            int z = Integer.parseInt(expr[4]);
            String op = expr[1];

            if (op.equals("+") && x + y == z || op.equals("-") && x - y == z) {
                answer[i] = "O";
            } else {
                answer[i] = "X";
            }
        }

        return answer;
    }
}