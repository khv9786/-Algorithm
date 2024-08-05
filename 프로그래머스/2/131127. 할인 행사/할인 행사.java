
class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        int[] N = new int[want.length];
        int q = 0;

        while(q < discount.length-9){
            for (int k =0;k<want.length;k++){
               N[k] = number[k];
            }

            for (int i = 0;i<10;i++){
                for (int j = 0 ; j<want.length;j++){
                   if(want[j].equals(discount[i+q])){
                    N[j]--;
                    break;
                    }
                }
            }

            for (int k =0;k<want.length;k++){
                if(N[k] != 0){
                   break;
                }
                if (k==want.length-1){
                    answer++;
                }
            }
            q++;
        }
        return answer;
    }
}