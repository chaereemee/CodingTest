import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int idx = 0;
        for(int[] command : commands) {
            int i = command[0];
            int j = command[1];
            int k = command[2];
            
            ArrayList<Integer> sry = new ArrayList<>();
            for(int m=i-1; m < j; m++) {
                sry.add(array[m]);
            }
            
            Collections.sort(sry);
            answer[idx] = sry.get(k-1);
            idx++;
        }
        return answer;
    }
}