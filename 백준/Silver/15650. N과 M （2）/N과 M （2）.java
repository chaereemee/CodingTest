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

        DFS(1,0, arr);
    }

    private static void DFS(int start, int depth, int[] arr) {
        if(depth == M) {
            for(int i=0; i<M; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }

        for(int i = start; i<=N; i++) {
            arr[depth] = i;
            DFS(i + 1,depth + 1, arr);
        }
    }
}