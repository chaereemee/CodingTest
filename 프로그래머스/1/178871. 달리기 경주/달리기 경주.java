import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        HashMap<String, Integer> map = new HashMap<>();
        
        for(int i=0; i<players.length; i++) {
            map.put(players[i], i);
        }
        
        for(String calling : callings) {
            int curIdx = map.get(calling);
            
            String players1 = players[curIdx];
            String players2 = players[curIdx-1];
            
            // 효율적인 순위 조회를 위해
            map.put(players1, curIdx-1);
            map.put(players2, curIdx);
            
            // 최종 순서
            players[curIdx-1] = players1;
            players[curIdx] = players2;
        }
        
        return players;
    }
}