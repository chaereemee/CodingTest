import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int halfNums = nums.length / 2;
        
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int kind = map.size();
        
        int result = kind > halfNums ? halfNums : kind;
        return result;
    }
}