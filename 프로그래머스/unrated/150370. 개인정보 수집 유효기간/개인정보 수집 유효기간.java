import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> answer = new ArrayList<>();
        String[] date = today.split("\\.| ");
        int YYYY = Integer.parseInt(date[0]);
        int MM = Integer.parseInt(date[1]);
        int DD = Integer.parseInt(date[2]);
        int to = ((YYYY - 2000) * 12 + MM) * 28 + DD;

        String[][] ter = new String[terms.length][2];

        for (int j = 0; j < terms.length; j++) {
            String[] pair = terms[j].split(" ");
            ter[j] = pair;
        }

        for (int i = 0; i < privacies.length; i++) {
            String[] pri = privacies[i].split("\\.| ");
            int YYYY1 = Integer.parseInt(pri[0]);
            int MM1 = Integer.parseInt(pri[1]);
            int DD1 = Integer.parseInt(pri[2]);
            String alpha = pri[3];
            int CG = ((YYYY1 - 2000) * 12 + MM1) * 28 + DD1;

            for (int k = 0; k < ter.length; k++) {
                if (ter[k][0].trim().equals(alpha.trim())) {
                    CG += (Integer.parseInt(ter[k][1]) * 28);
                    break;
                }
            }

            if (to >= CG) {
                answer.add(i + 1);
            }
        }

        return answer;
    }
}
