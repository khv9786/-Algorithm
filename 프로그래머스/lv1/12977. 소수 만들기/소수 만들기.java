class Solution {
    public int solution(int[] nums) {
        int answer = 0;

        for(int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                for(int k=j+1; k<nums.length; k++){                  
                    int prime = nums[i] + nums[j] + nums[k];      
                    
                    if(PrimeNumber(prime)){
                        answer ++;
                    }
                }
            }
        }
        return answer;
    }
            
    private boolean PrimeNumber(int prime){
        for(int l = 2; l < prime; l++){
            if(prime % l == 0){
             return false;
            }
        }return true;
    }
}