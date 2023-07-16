class Solution {
    public String solution(String my_string, int num1, int num2) {
        char[] charArray = my_string.toCharArray();
        
        if (num1 >= 0 && num1 < charArray.length && num2 >= 0 && num2 < charArray.length) {
            char temp = charArray[num1];
            charArray[num1] = charArray[num2];
            charArray[num2] = temp;
        } else {

        }
        
        return new String(charArray);
    }
}
