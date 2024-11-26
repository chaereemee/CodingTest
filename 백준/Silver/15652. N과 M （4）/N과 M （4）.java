import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        result = new int[M];
        DFS(0, 1);
    }

    private static void DFS(int depth, int start) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=start; i<=N; i++) {
            result[depth] = i;
            DFS(depth+1, i);
        }
    }
}