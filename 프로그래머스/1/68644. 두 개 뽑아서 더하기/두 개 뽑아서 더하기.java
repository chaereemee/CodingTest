import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {  
        TreeSet<Integer> sortedSet = new TreeSet<>();
        
        for(int i=0; i<numbers.length; i++) {
            for(int j=i+1; j<numbers.length; j++) {
                sortedSet.add(numbers[i]+numbers[j]);
            }
        }
        
        int[] result = new int[sortedSet.size()];
        int index = 0;
        for(int num : sortedSet) {
            result[index++] = num;
        }
        
        return result;
    }
}