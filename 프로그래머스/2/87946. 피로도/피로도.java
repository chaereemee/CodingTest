class Solution {
    static int N;
    static boolean[] visited;
    static int maxCount = 0;
    static int[][] dungeons;
    public int solution(int k, int[][] dungeonsInput) {
        N = dungeonsInput.length;
        dungeons = dungeonsInput;
        visited = new boolean[N];
        DFS(k, 0, visited);
        return maxCount;
    }
    
    private static void DFS(int k, int count, boolean[] visited) {
        maxCount = Math.max(maxCount, count);
        
        for(int i=0; i<N; i++) {
            if(!visited[i] && k >= dungeons[i][0]) {
                visited[i] = true;
                DFS(k - dungeons[i][1], count+1, visited);
                visited[i] = false;
            }
        }
    }
}