import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int count = 1; // B에서 시작하므로 초기 count는 1
        while(A < B) {
            if(B % 2 == 0) {
                B /= 2;
            } else if(B % 10 == 1) { // B의 마지막 자리가 1일 때
                B /= 10;
            } else {
                break;
            }
            count++;
        }

        if(B == A) System.out.println(count);
        else System.out.println(-1);
    }
}