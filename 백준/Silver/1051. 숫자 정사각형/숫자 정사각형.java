import java.util.*;
import java.io.*;

public class Main {
    public static void main(String [] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[n][m];
        
        for(int i=0; i<n; i++) {
            String str = br.readLine();
            for(int j=0; j<m; j++) {
                arr[i][j] = str.charAt(j) - '0';
            }
        }
        
        int answer = 1;
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                for(int size=1; i+size <n; size++) {
                    if(j+size < m) {
                        int a = arr[i][j];
                        int b = arr[i][j+size];
                        int c = arr[i+size][j];
                        int d = arr[i+size][j+size];
                        
                        if(a == b && b == c && c == d) {
                            answer = Math.max(answer, (size+1)*(size+1));
                        }
                    }
                }
            }
        }
        System.out.println(answer);
    }
}