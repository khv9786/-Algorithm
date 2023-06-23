import java.util.*;

class Solution {
    public int solution(int[] ing) {
        int answer = 0;
        Stack<Integer> st = new Stack<Integer>();

        for (int a : ing) {
            st.push(a);

            if (st.size() >= 4) {
                if (st.get(st.size() - 1) == 1
                        && st.get(st.size() - 2) == 3
                        && st.get(st.size() - 3) == 2
                        && st.get(st.size() - 4) == 1) {

                    answer++;
                    for (int i = 0; i < 4; i++) {
                        st.pop();
                    }
                }
            }
        }

        return answer;
    }
}
