import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int start = 0;
        int end = N-1;
        int max = Integer.MAX_VALUE;
        int s = 0;
        int e = 0;
        while(start < end) {
            int sum = arr[start] + arr[end];
            if(Math.abs(sum) < Math.abs(max)) {
                max = sum;
                s = start;
                e = end;
            }

            if(sum > 0) end--;
            else start++;
        }
        System.out.println(arr[s] + " " + arr[e]);
    }
}