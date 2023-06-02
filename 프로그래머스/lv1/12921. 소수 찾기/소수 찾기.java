class Solution {
    public int solution(int n) {
        int answer = 0;
        int[] arr = new int[n+1];   

        for(int i=0;i<=n;i++){  // 배열로 숫자 정리
            arr[i]=i;   
        }

        arr[1]=0;   


        for(int i=2;i<=n;i++){ // 배수 찾기
            if(arr[i]==0)continue;  

            for(int j = i*2; j <= n; j+=i){ // i의 배수면 소수가 아니므로 0으로 만들기
                arr[j]=0;   
            }
        }

        
        for(int i=0;i<arr.length;i++){  // 0이 아닌 값이면 소수.
            if(arr[i]!=0){ 
                answer++;  
            }
        }
        return answer;
    }
}