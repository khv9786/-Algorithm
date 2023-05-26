class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
            
        for(int i = 0; i<babbling.length; i++){
            babbling[i] = babbling[i].replace("aya", "가능");
            babbling[i] = babbling[i].replace("ye", "가능");
            babbling[i] = babbling[i].replace("woo", "가능");
            babbling[i] = babbling[i].replace("ma", "가능");
            babbling[i] = babbling[i].replace("가능", "");
            if(babbling[i] == ""){
                answer++;
            }
        }
        
        return answer;
    }
}