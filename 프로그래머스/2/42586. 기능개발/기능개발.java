import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        ArrayList<Integer> list = new ArrayList<>();
        
        int n = progresses.length;
        int[] days = new int[n];
        for(int i=0; i<n; i++) {
            int remaining = 100 - progresses[i];
            days[i] = remaining % speeds[i] == 0 ? remaining / speeds[i] : remaining / speeds[i] + 1;
        }
        
        int deploy = days[0];
        int count = 1;
        for(int i=1; i<n; i++) {
            if(days[i] <= deploy) {
                count++;
            } else {
                list.add(count);
                deploy = days[i];
                count = 1;
            }
        }
        
        list.add(count);
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}