import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        if (N == 0) { // 입력이 0일 경우 예외 처리
            System.out.println(0);
            return;
        }

        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(scores);

        // 절사할 개수 계산
        int trim = (int) Math.round(N * 0.15);

        // 중간 값들의 합 계산
        int sum = 0;
        for (int i = trim; i < N - trim; i++) {
            sum += scores[i];
        }

        // 절사평균 계산 후 반올림
        int count = N - 2 * trim;
        int avg = (int) Math.round((double) sum / count);

        System.out.println(avg);
    }
}