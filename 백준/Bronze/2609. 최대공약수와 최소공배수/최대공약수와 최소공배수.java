import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
        int gcd = getGCD(a, b);
        int lcm = (a * b) / gcd;
        
        System.out.println(gcd);
        System.out.println(lcm);
    }
    
    // 유클리드 호제법을 이용한 최대공약수(GCD) 계산
    private static int getGCD(int a, int b) {
        while(b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}