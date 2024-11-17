import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            // DP 배열 생성
            int[][] dp = new int[m + 1][n + 1];

            // DP 테이블 초기화
            for (int i = 0; i <= m; i++) {
                dp[i][0] = 1; // 아무것도 고르지 않는 경우
            }

            for (int i = 1; i <= m; i++) {
                for (int j = 1; j <= n; j++) {
                    if (i >= j) {
                        dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j];
                    }
                }
            }
            sb.append(dp[m][n]).append("\n");
        }
        System.out.print(sb);
    }
}
