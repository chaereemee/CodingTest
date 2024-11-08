import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] A; // 그래프 저장할 인접 리스트
    static int[] check; // 각 노드의 그룹 번호 저장할 배열
    static boolean[] visited; // 방문 여부 기록하는 배열
    static boolean isEven; // 이분 그래프 여부 확인하는 변수
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int t=0; t<testCase; t++) {
            String[] s = br.readLine().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            // 초기화
            A = new ArrayList[V+1];
            check = new int[V+1];
            visited = new boolean[V+1];
            isEven = true;

            // 각 노드에 대해 인접 리스트 초기화
            for(int i=1; i<=V; i++) {
                A[i] = new ArrayList<Integer>();
            }

            // 간선 정보를 입력받아 양방향 그래프로 인접 리스트에 저장
            for(int i=0; i<E; i++) {
                s = br.readLine().split(" ");
                int start = Integer.parseInt(s[0]);
                int end = Integer.parseInt(s[1]);
                A[start].add(end);
                A[end].add(start);

            }

            // 모든 노드에서 DFS 수행
            for(int i=1; i<=V; i++) {
                if(isEven) {
                    DFS(i);
                } else { // 이분 그래프가 아니면 종료
                    break;
                }
            }

            if(isEven) sb.append("YES\n");
            else sb.append("NO\n");
        }
        System.out.println(sb);
    }

    private static void DFS(int node) {
        visited[node] = true;
        for(int i : A[node]) {
            if(!visited[i]) {
                check[i] = (check[node] + 1) % 2;
                DFS(i);
            } else if(check[i] == check[node]) {
                isEven = false;
            }
        }
    }
}