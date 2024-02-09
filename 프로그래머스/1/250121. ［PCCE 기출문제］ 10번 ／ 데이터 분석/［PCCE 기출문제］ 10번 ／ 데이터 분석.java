import java.util.*;
import java.util.stream.Collectors;

class Solution {
    int extIndex, sort_by_index;

    public int[][] solution(int[][] data, String ext, int val_ext, String sort_by) {
        init(ext, sort_by); 
        List<int[]> filteredSortedData = Arrays.stream(data)
                .filter(arr -> arr[extIndex] < val_ext) 
                .sorted(Comparator.comparingInt(o -> o[sort_by_index]))
                .collect(Collectors.toList()); 
        int[][] answer = new int[filteredSortedData.size()][];
        answer = filteredSortedData.toArray(answer);

        return answer;
    }

    void init(String ext, String sort_by) {
        Map<String, Integer> indexMap = Map.of(
                "code", 0,
                "date", 1,
                "maximum", 2,
                "remain", 3);

        extIndex = indexMap.getOrDefault(ext, -1);
        sort_by_index = indexMap.getOrDefault(sort_by, -1);
    }
}