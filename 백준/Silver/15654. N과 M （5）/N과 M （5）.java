import java.util.*;
import java.io.*;

public class Main {
    static int N, M;
    static int[] arr;
    static int[] result;
    static boolean[] visited;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());

        arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        result = new int[N];
        visited = new boolean[N];
        DFS(0, arr, result, visited);
    }

    private static void DFS(int depth, int[] arr, int[] result, boolean[] visited) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(result[i] + " ");
            }
            System.out.println();
            return;
        }

        for(int i=0; i<N; i++) {
            if(!visited[i]) {
                visited[i] = true;
                result[depth] = arr[i];
                DFS(depth+1, arr, result, visited);
                visited[i] = false;
            }
        }
    }
}