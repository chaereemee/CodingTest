import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> wearMap = new HashMap<>();

            // 의류 정보를 HashMap에 저장
            for(int j = 0; j < N; j++) {
                String[] tokens = br.readLine().split(" ");
                String type = tokens[1];
                wearMap.put(type, wearMap.getOrDefault(type, 0) + 1);
            }

            // 모든 경우의 수 계산
            int result = 1;
            for(int count : wearMap.values()) {
                result *= (count + 1); // 각 종류마다 안 입는 경우 추가
            }

            // 아무것도 안 입는 경우 제외
            result -= 1;

            sb.append(result).append("\n");
        }

        System.out.print(sb);
    }
}