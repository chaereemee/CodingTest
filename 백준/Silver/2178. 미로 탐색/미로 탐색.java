import java.io.*;
import java.util.*;

public class Main {
    static int N, M;
    static int[][] maze;
    static boolean[][] visited;
    /** 상하좌우 이동을 나타내는 배열 */
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        /** maze와 visited 배열을 N X M 크기로 초기화 */
        maze = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++) {
            String line = br.readLine(); /** 줄로 입력 받아 */
            for(int j=0; j<M; j++) {
                /** 문자를 정수로 변환 */
                maze[i][j] = line.charAt(j) - '0';
            }
        }

        /** (0, 0)에서 시작해 (N-1, M-1)까지의 최단 거리 */
        System.out.println(BFS(0, 0));
    }

    /** BFS 시작점 (x, y)부터 시작해 목표 지점까지의 최단 경로 길이를 반환 */
    private static int BFS(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        maze[x][y] = 1; /** 시작 지점의 거리를 1로 설정 */

        while(!queue.isEmpty()) {
            int[] current = queue.poll(); /** 첫번째 원소 꺼냄 */
            int cx = current[0];
            int cy = current[1];

            /** 목표 지점에 도달하면 그 위치에 저장된 거리 반환 */
            if(cx == N-1 && cy == M-1) {
                return maze[cx][cy];
            }

            /** 상하좌우 네 방향을 탐색하기 위해 반복문 사용 */
            for(int i=0; i<4; i++) {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx>=0 && ny>=0 && nx<N && ny<M) {
                    if(maze[nx][ny] == 1 && !visited[nx][ny]) {
                        visited[nx][ny] = true;
                        maze[nx][ny] = maze[cx][cy] + 1;
                        queue.add(new int[]{nx, ny});
                    }
                }
            }
        }
        return -1; /** BFS 탐색을 마쳤는데도 목표 지점에 도달하지 못한 경우 -1 */
    }
}