import java.io.*;
import java.util.*;

public class Main {
    static char[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        board = new char[N][M];
        
        for (int i = 0; i < N; i++) {
            String line = br.readLine();
            for (int j = 0; j < M; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        
        int minChanges = Integer.MAX_VALUE;
        
        for (int i = 0; i <= N - 8; i++) {
            for (int j = 0; j <= M - 8; j++) {
                minChanges = Math.min(minChanges, getMinChanges(i, j));
            }
        }
        
        System.out.println(minChanges);
    }
    
    private static int getMinChanges(int x, int y) {
        int count1 = 0; // 시작이 W
        int count2 = 0; // 시작이 B
        
        char[][] pattern = {{'W', 'B'}, {'B', 'W'}};
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i][y + j] != pattern[i % 2][j % 2]) count1++;
                if (board[x + i][y + j] != pattern[(i + 1) % 2][j % 2]) count2++;
            }
        }
        
        return Math.min(count1, count2);
    }
}