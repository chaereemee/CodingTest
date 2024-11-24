import java.util.*;

class Solution {
    public int solution(int[][] sizes) {
        int maxHight = 0;
        int maxWidth = 0;
        for(int[] size : sizes) {
            int height = Math.max(size[0], size[1]);
            int width = Math.min(size[0], size[1]);
            
            maxHight = Math.max(maxHight, height);
            maxWidth = Math.max(maxWidth, width);
        }
        return maxHight*maxWidth;
    }
}