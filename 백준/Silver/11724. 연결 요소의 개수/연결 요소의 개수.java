import java.io.*;
import java.util.*;

public class Main {
    static boolean visited[]; // 각 정점이 방문되었는지 여부 기록
    static ArrayList<Integer>[] A; // 각 정점과 연결된 다른 정점들 저장
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken()); // 정점의 개수
        int m = Integer.parseInt(st.nextToken()); // 간선의 개수

        visited = new boolean[n+1]; // 인덱스 0을 사용하지 않기 위해
        A = new ArrayList[n+1]; // 인덱스 0을 사용하지 않기 위해
        for(int i=1;i<n+1;i++){
            A[i] = new ArrayList<Integer>();
        }
        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());
            A[s].add(e);
            A[e].add(s);
        }
        int count = 0;
        for(int i=1;i<n+1;i++){
            if(!visited[i]){
                count++;
                DFS(i);
            }
        }
        System.out.println(count);
    }

    private static void DFS(int v){
        if(visited[v]){
            return;
        }
        visited[v] = true;
        for(int i : A[v]){
            if(!visited[i]){
                DFS(i);
            }
        }
    }
}