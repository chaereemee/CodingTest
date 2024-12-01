import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        int[] day = new int[progresses.length];
        for(int i=0; i<day.length; i++) {
            int remaining = 100 - progresses[i];
            day[i] = remaining % speeds[i] == 0 ? remaining / speeds[i] : remaining / speeds[i] + 1;
        }
        
        Queue<Integer> queue = new LinkedList<>();
        int deploy = day[0];
        int count = 1;
        for(int i=1; i<day.length; i++) {
            if(deploy >= day[i]) {
                count++;
            } else {
                queue.add(count);
                count = 1;
                deploy = day[i];
            }
        }
        queue.add(count);
        
        int[] result = new int[queue.size()];
        for(int i=0; i<result.length; i++) {
            result[i] = queue.poll();
        }
        
        return result;
    }
}