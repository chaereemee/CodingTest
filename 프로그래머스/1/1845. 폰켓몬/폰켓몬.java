import java.util.*;

class Solution {
    public int solution(int[] nums) {
       int count = nums.length / 2;
        TreeSet<Integer> set = new TreeSet<>();
        
        for (int num : nums) {
            set.add(num);
        }
        
        int kinds = set.size();
        int answer;
        
        if (kinds > count)
            answer = count;
        else
            answer = kinds;
        
        return answer;
    }
}