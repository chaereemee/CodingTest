import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        int[][] D = new int[15][15];
        
        // 0층 초기화
        for(int i=1; i<=14; i++) {
            D[0][i] = i;
        }
        
        // DP 배열 채우기
        for(int k=1; k<=14; k++) {
            for(int n=1; n<=14; n++) {
                D[k][n] = D[k][n-1] + D[k-1][n];
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(D[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}