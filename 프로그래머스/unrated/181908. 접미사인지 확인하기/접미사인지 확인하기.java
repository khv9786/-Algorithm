class Solution {
    public int solution(String my_string, String is_suffix) {
    int stringLength = my_string.length();
    int suffixLength = is_suffix.length();

    if (stringLength < suffixLength) {
        return 0; // 접미사의 길이가 더 긴 경우, 일치할 수 없습니다.
    }

    // 문자열의 뒤에서부터 접미사를 검사합니다.
    for (int i = 1; i <= suffixLength; i++) {
        if (my_string.charAt(stringLength - i) != is_suffix.charAt(suffixLength - i)) {
            return 0; // 일치하지 않으면 0을 반환합니다.
        }
    }

    return 1; // 모든 문자가 일치하면 1을 반환합니다.
    }
}