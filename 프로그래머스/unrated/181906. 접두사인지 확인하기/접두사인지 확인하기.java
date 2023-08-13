class Solution {
    public int solution(String my, String is) {       
        int answer = 0;
        
        if (my.contains(is) && is.charAt(0) == my.charAt(0) && is.charAt(is.length()-1) == my.charAt(is.length()-1) ) {
            answer = 1;
        }
        
        return answer;
    }
}
