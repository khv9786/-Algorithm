import java.util.HashMap;
class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0 ,0};
        HashMap<String, Integer> wordMap = new HashMap<String, Integer>();
        wordMap.put(words[0], 0);

        for(int i = 1; i < words.length; ++i) {
            wordMap.put(words[i], 0);

            if (words[i-1].charAt(words[i-1].length()-1) != words[i].charAt(0) || wordMap.size() < i + 1) {
                //현재 단어와 이전 단어의 끝과 시작이 일치하고, wordMap의 범주인지 체크.
                answer[0] = i % n + 1;
                answer[1] = i / n + 1;
                break;
            }
        }

        return answer;
    }
}