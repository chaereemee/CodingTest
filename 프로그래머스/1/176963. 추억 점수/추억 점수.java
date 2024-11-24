import java.util.*;

class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i=0; i<name.length; i++) {
            map.put(name[i], yearning[i]);
        }
        
        int[] result = new int[photo.length];
        for(int i=0; i<photo.length; i++) {
            int count = 0;
            for(String p : photo[i]) {
                count += map.getOrDefault(p, 0);
            }
            result[i] = count;
        }
        
        return result;
    }
}