import java.util.*;

class Solution {
    public int solution(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        
        for(int i : nums) {
            set.add(i);
        }
        
        if(set.size() < nums.length / 2)
            return set.size();
        else
            return nums.length / 2;
    }
}