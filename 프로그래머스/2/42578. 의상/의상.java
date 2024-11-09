import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] c : clothes) {
            String kind = c[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }
        
        int count = 1;
        for(int value : map.values()) {
            count *= (value + 1); // 각 종류에서 선택하지 않은 경우 포함
        }
        
        return count - 1;
    }
}