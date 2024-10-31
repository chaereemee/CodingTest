import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int x = 1;
        int y = 1;
        for(int i=0; i<K; i++) {
            x *= (N-i);
            y *= (i+1);
        }

        System.out.println(x/y);
    }
}