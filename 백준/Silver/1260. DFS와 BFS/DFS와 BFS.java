import java.io.*;
import java.util.*;

public class Main {
    static int N, M, V;
    static boolean[] visited;
    static ArrayList<Integer>[] graph;
    static List<Integer> dfsResult;
    static List<Integer> bfsResult;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());

        visited = new boolean[N + 1];
        graph = new ArrayList[N + 1];
        dfsResult = new ArrayList<>();
        bfsResult = new ArrayList<>();

        for(int i=1; i<=N; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a].add(b);
            graph[b].add(a);
        }

        for(int i=1; i<=N; i++) {
            Collections.sort(graph[i]);
        }

        DFS(V);

        Arrays.fill(visited, false);
        BFS(V);

        for (int node : dfsResult) {
            System.out.print(node + " ");
        }
        System.out.println();
        for (int node : bfsResult) {
            System.out.print(node + " ");
        }
        System.out.println();
    }

    static void DFS(int node) {
        visited[node] = true;
        dfsResult.add(node);

        for(int next : graph[node]) {
            if (!visited[next]) {
                DFS(next);
            }
        }
    }

    static void BFS(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while(!queue.isEmpty()) {
            int node = queue.poll();
            bfsResult.add(node);

            for(int next : graph[node]) {
                if (!visited[next]) {
                    visited[next] = true;
                    queue.add(next);
                }
            }
        }
    }
}