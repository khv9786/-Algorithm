import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr) {
        int size = arr.length;
        int pow = (int) Math.ceil(Math.log(size) / Math.log(2)); 
        int newSize = (int) Math.pow(2, pow);
        
        // 배열 크기가 이미 2의 거듭제곱인 경우 원본 배열 반환
        if (newSize == size) {
            return arr;
        }

        int[] answer = Arrays.copyOf(arr, newSize);
        return answer;
    }
}
