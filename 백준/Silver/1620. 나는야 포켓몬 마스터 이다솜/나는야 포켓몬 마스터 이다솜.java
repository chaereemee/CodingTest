import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // 번호 -> 이름 맵
        HashMap<Integer, String> mapNumToName = new HashMap<>();
        // 이름 -> 번호 맵
        HashMap<String, Integer> mapNameToNum = new HashMap<>();
        
        for (int i = 1; i <= n; i++) {
            String str = br.readLine();
            mapNumToName.put(i, str);
            mapNameToNum.put(str, i);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < m; i++) {
            String answer = br.readLine();
            if (isNumber(answer)) {
                // 숫자인 경우 번호로 이름 찾기
                sb.append(mapNumToName.get(Integer.parseInt(answer))).append("\n");
            } else {
                // 이름으로 번호 찾기
                sb.append(mapNameToNum.get(answer)).append("\n");
            }
        }
        System.out.println(sb);
    }

    // 숫자인지 확인하는 메서드
    private static boolean isNumber(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}