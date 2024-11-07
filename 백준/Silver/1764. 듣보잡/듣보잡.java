import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        // 듣도 못한 사람을 저장하는 집합
        HashSet<String> listen = new HashSet<>();
        for(int i=0; i<N; i++) {
            listen.add(br.readLine());
        }

        // 보도 못한 사람을 저장하는 집합
        HashSet<String> look = new HashSet<>();
        for(int i=0; i<M; i++) {
            look.add(br.readLine());
        }

        // 듣도 보도 못한 사람의 교집합 찾기
        listen.retainAll(look);

        // 결과를 정렬하기 위해 리스트로 변환
        List<String> listenLook = new ArrayList<>(listen);
        Collections.sort(listenLook);

        // 출력
        StringBuilder sb = new StringBuilder();
        sb.append(listenLook.size()).append("\n");
        for (String name : listenLook) {
            sb.append(name).append("\n");
        }
        System.out.print(sb);
    }
}
