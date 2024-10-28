import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        // 빈도 배열 생성
        int[] count = new int[10001];
        
        // 빈도 배열에 기록 (num이 3이면 count[3]++)
        for(int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            count[num]++;
        }
        
        StringBuilder sb = new StringBuilder();
        // 결과 출력
        for(int i = 0; i < count.length; i++) {
            while(count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        
        System.out.print(sb);
    }
}