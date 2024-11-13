import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n];
        int[] count = new int[8001]; // -4000 ~ 4000 값 저장

        int sum = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int mode = 0;
        int maxCount = 0;
        
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
            count[nums[i] + 4000]++;
            
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
        }

        // 정렬
        Arrays.sort(nums);

        // 최빈값 계산
        boolean second = false; // 두 번째로 작은 최빈값 판별
        for (int i = 0; i < 8001; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                mode = i - 4000;
                second = true;
            } else if (count[i] == maxCount && second) {
                mode = i - 4000;
                second = false;
            }
        }

        // 산술평균
        sb.append(Math.round((double) sum / n)).append("\n");

        // 중앙값
        sb.append(nums[n / 2]).append("\n");

        // 최빈값
        sb.append(mode).append("\n");

        // 범위
        sb.append(max - min).append("\n");

        System.out.println(sb);
    }
}