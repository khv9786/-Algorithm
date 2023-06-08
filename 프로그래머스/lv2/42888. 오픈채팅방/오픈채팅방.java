import java.util.*;

class Solution {
    public String[] solution(String[] record) {

        ArrayList<String> list = new ArrayList<>();
        int len = record.length;
        HashMap <String,String> map = new HashMap<String,String>();

        String [] recArr = {};
        for(int i = 0 ; i<len ; i++) {
            recArr= record[i].split(" ");
            switch(recArr[0]) {
                case "Enter":
                   list.add(recArr[2]+"@님이 들어왔습니다.@"+recArr[1]);
                   map.put(recArr[1],recArr[2]);
                    break;
                case "Change":
                    map.put(recArr[1],recArr[2]);
                    break;
                case "Leave":
                    list.add(map.get(recArr[1]) +"@님이 나갔습니다.@"+recArr[1]);
                    break;
                default:
                    break;

            }                
        }
        int lsize = list.size();
        String [] temp = {}; 
        for(int i = 0; i<lsize; i++) {
           temp = list.get(i).split("@");
           if(map.containsKey(temp[2])) {
               list.set(i,list.get(i).replace(temp[0],map.get(temp[2])));
           }
        }
       String [] answer = new String[list.size()];
       String [] tmp2 = {};
        for(int i = 0;i<list.size(); i++) {
           tmp2= list.get(i).split("@");
           answer[i] = tmp2[0]+tmp2[1];

        }

        return answer;
    }
}