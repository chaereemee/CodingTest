import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int count = 0;
        while(N > 0) {
            if(N % 5 == 0) {
                count += N / 5;
                N = N % 5;
            } else {
                N -= 3;
                count++;
            }
        }
        
        if(N < 0) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }
    }
}