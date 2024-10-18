import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        long[] sArr = new long[n+1];
        st = new StringTokenizer(br.readLine());
        for(int i = 1; i <= n; i++) {
            sArr[i] = sArr[i-1] + Integer.parseInt(st.nextToken());
        }
        
        for(int q = 0; q < m; q++) {
            st = new StringTokenizer(br.readLine());
            
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            
            System.out.println(sArr[j] - sArr[i-1]);
        }
    }
}