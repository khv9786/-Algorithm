import java.util.*;

class Solution {
    public String[] solution(String myString) {
        String[] arr = myString.split("x");
        ArrayList<String> splitX = new ArrayList<>();
        
        for (String str : arr) {
            if (!str.isEmpty()) {
                splitX.add(str);
            }
        }
        
        String[] answer = splitX.toArray(new String[splitX.size()]);
        Arrays.sort(answer);
     
        return answer;
    }
}