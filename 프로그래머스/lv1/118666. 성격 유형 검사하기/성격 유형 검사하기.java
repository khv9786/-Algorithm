class Solution {
    public String solution(String[] survey, int[] choices) {
        String answer = "";
        String types = "RTCFJMAN";
        int [] scores = new int[types.length()];

        for(int i = 0; i < choices.length; i++){
            if(choices[i] < 4){
                scores[types.indexOf(survey[i].charAt(0))] += Math.abs(choices[i] - 4);
            }else if(choices[i] > 4){
                scores[types.indexOf(survey[i].charAt(1))] += Math.abs(choices[i] - 4);
            }
        }
        for (int i = 0; i < scores.length-1; i+=2){
            if(scores[i] < scores[i+1]){
                answer = answer + types.charAt(i+1);
            }else answer += types.charAt(i);
        }
        
        return answer;
    }
}