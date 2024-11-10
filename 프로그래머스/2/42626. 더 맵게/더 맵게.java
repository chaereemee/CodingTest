import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        
        // 배열의 모든 요소를 힙에 삽입
        for(int s : scoville)
            heap.add(s);
        
        int count = 0;
        while(heap.size() > 1) { // 최소 2개 이상일 때만 섞기 가능
            int first = heap.poll();
            if(first >= K) {
                return count; // 모든 값이 K 이상이면 종료
            }
            
            int second = heap.poll();
            int newScoville = first + (second * 2);
            heap.add(newScoville);
            count++;
        }
        
        return heap.peek() >= K ? count : -1;
    }
}