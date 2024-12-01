import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(String[] c : clothes) {
            String kind = c[1];
            map.put(kind, map.getOrDefault(kind, 0) + 1);
        }
        
        int count = 1;
        for(String key : map.keySet()) {
            count *= map.get(key) + 1;
        }
        count -= 1;
        
        return count;
    }
}