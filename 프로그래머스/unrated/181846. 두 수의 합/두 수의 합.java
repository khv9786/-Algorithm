import java.math.BigInteger;
import java.util.*;

class Solution {
    public String solution(String a, String b) {
        BigInteger big_a = new BigInteger(a);
        BigInteger big_b = new BigInteger(b);
        String answer = (big_a.add(big_b)).toString();
        return answer;
    }
}
