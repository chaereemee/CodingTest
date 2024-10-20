import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[n];
        st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int start_index = 0;
        int end_index = 0;
        int sum = arr[0];
        int minLength = Integer.MAX_VALUE;
        
        while (end_index < n) {
            if (sum >= m) {
                minLength = Math.min(minLength, end_index - start_index + 1);
                sum -= arr[start_index];
                start_index++;
            } else {
                if (end_index < n - 1) {
                    end_index++;
                    sum += arr[end_index];
                } else {
                    break;
                }
            }
        }
        
        if (minLength == Integer.MAX_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(minLength);
        }
    }
}