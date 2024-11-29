import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        // dp
        Long[] dp = new Long[101];
        dp[1] = 1L;
        dp[2] = 1L;
        dp[3] = 1L;

        for(int i=4; i<dp.length; i++){
            dp[i] = dp[i-2] + dp[i-3];
        }

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            int n = Integer.parseInt(br.readLine());
            sb.append(dp[n]).append("\n");
        }

        System.out.print(sb);
    }
}