import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] tArr = new int[6];
        for(int i=0; i<tArr.length; i++){
            tArr[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        // 티셔츠 T장씩 최소 몇 묶음인지
        int minT = 0;
        for(int i=0; i<tArr.length; i++){
            minT += (tArr[i] + T - 1) / T;
        }

        // 펜 P자루씩 최대 몇 묶음인지와  남는 펜 수
        int maxP = N / P;
        int remainingPens = N % P;

        System.out.println(minT);
        System.out.println(maxP + " " + remainingPens);
    }
}