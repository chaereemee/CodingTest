import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        int[] result = new int[M];
        DFS(0, result);
        System.out.println(sb);
    }
    
    private static void DFS(int depth, int[] result) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
            return;
        }
        
        for(int i=1; i<=N; i++) {
            result[depth] = i;
            DFS(depth+1, result);
        }
    }
}