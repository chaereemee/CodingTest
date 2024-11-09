import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int count = nums.length / 2;
        HashSet<Integer> set = new HashSet<>();
        
        for(int num : nums) {
            set.add(num);
        }
        
        if(set.size() < count)
            return set.size();
        else
            return count;
    }
}