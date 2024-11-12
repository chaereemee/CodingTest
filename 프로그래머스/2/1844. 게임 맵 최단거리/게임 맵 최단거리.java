import java.util.*;

class Solution {
    static int[] dx = {0, 0, -1, 1}; // 상하좌우
    static int[] dy = {1, -1, 0, 0};
    
    public int solution(int[][] maps) {
        return BFS(maps);
    }
    
    static int BFS(int[][] maps) {
        Queue<int[]> queue = new LinkedList<>();
        boolean[][] visited = new boolean[maps.length][maps[0].length];
        int[] start = {0, 0, 1};
        queue.add(start);
        visited[0][0] = true;
        
        
        while(!queue.isEmpty()) {
            int[] arr = queue.poll();
            int x = arr[0];
            int y = arr[1];
            int cnt = arr[2];
            
            if(x == maps.length-1 && y == maps[0].length-1) {
                return arr[2];
            } else {
                for(int i=0; i<4; i++) {
                    int nx = x + dx[i];
                    int ny = y + dy[i];
                    
                    if(nx == maps.length || nx < 0 || ny == maps[0].length || ny < 0)
                        continue;
                    
                    if(visited[nx][ny] || maps[nx][ny] != 1)
                        continue;
                    
                    visited[nx][ny] = true;
                    int[] nextArr = {nx, ny, cnt+1};
                    queue.add(nextArr);
                }
            }
        }
        return -1;
    }
}