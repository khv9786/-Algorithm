import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static List<String> solution(String[] picture, int k) {
        List<String> answer = new ArrayList<>();

        for (int i = 0; i < picture.length; i++) {
            String item = picture[i];
            StringBuilder line = new StringBuilder();

            for (int j = 0; j < item.length(); j++) {
                char charAt = item.charAt(j);

                for (int l = 0; l < k; l++) {
                    if (charAt == '.') {
                        line.append('.');
                    }
                    if (charAt == 'x') {
                        line.append('x');
                    }
                }
            }

            for (int l = 0; l < k; l++) {
                answer.add(line.toString());
            }
        }

        return answer;
    }
}
