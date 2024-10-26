import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int N, M;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        int[] arr = new int[9];
        boolean[] visited = new boolean[9];

        for(int i=0; i<8; i++) {
            visited[i] = false;
        }

        DFS(0, visited, arr);
    }

    private static void DFS(int depth, boolean[] visited, int[] arr) {
        // 종료 조건
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for(int i=1; i<=N; i++) {
            if(visited[i]) {
                continue;
            }

            arr[depth] = i;
            visited[i] = true;
            DFS(depth + 1, visited, arr);
            visited[i] = false;
        }
    }
}