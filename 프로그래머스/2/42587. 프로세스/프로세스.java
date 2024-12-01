import java.util.*;

class Solution {
    public int solution(int[] priorities, int location) {
        Queue<int[]> queue = new LinkedList<>();
        
        for(int i=0; i<priorities.length; i++) {
            queue.add(new int[] {priorities[i], i}); // 중요도, 순서
        }
        
        int count = 1;
        while(!queue.isEmpty()) {
            int[] process = queue.poll();
            
            boolean high = true;
            for(int[] q : queue) {
                if(process[0] < q[0]) {
                    high = false;
                    queue.add(process);
                    break;
                }
            }
            
            if(high) {
                if(process[1] == location) {
                    return count;
                }
                
                count++;
            }
        }
        
        return -1;
    }
}