import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        long[] arr = new long[N];

        // 배열 입력
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
        }

        // 배열 정렬
        Arrays.sort(arr);

        long minDiff = Long.MAX_VALUE; // 0에 가장 가까운 값을 저장
        long[] result = new long[3];  // 결과로 출력할 세 숫자

        // 첫 번째 숫자 고정
        for (int i = 0; i < N - 2; i++) {
            int start = i + 1;  // 두 번째 숫자
            int end = N - 1;    // 세 번째 숫자

            while (start < end) {
                long sum = arr[i] + arr[start] + arr[end];

                // 0에 더 가까운 합을 발견하면 결과 업데이트
                if (Math.abs(sum) < minDiff) {
                    minDiff = Math.abs(sum);
                    result[0] = arr[i];
                    result[1] = arr[start];
                    result[2] = arr[end];
                }

                // 합이 0보다 크면 줄이기 위해 end 이동
                if (sum > 0) {
                    end--;
                }
                // 합이 0보다 작으면 키우기 위해 start 이동
                else {
                    start++;
                }
            }
        }

        // 결과 출력
        Arrays.sort(result);
        System.out.println(result[0] + " " + result[1] + " " + result[2]);
    }
}