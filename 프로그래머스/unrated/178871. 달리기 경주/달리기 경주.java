import java.util.*;
class Solution {
    public String[] solution(String[] players, String[] callings) {
        Map<String,Integer> rmap = new HashMap<>();
        for(int i=0; i<players.length; i++){
            rmap.put(players[i],i);
        }
        
        for(int i = 0; i<callings.length; i++){
        
            int p = rmap.get(callings[i]); //kai 는 [3] = p
            String fp = players[p-1];  //p 에서 -1 위치 인 poe = fp
            
            players[p-1]= callings[i]; // 위치 스위칭 
            players[p] = fp;           // poe <=> kai
            
            rmap.put(callings[i],p-1); // rmap에 정리 
            rmap.put(fp,p);
            
        }
        
        return players;
    }
}