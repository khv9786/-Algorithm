class Solution {
    public int solution(String[] order) {
        int answer = 0;
        String ia = "americano";
        String any = "anything";
        String latte = "cafelatte";
        
        for(int i = 0; i<order.length; i++){
            if(order[i].contains(ia) ||order[i].contains(any)){
                answer += 4500;
            }else if (order[i].contains(latte)){
                answer += 5000;
            }
        }
        
        return answer;
    }
}