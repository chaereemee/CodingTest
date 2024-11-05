import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        for(int i=0; i<T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            Queue<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<N; j++) {
                int p = Integer.parseInt(st.nextToken());
                queue.add(new int[] {j, p}); // [인덱스, 중요도]
            }

            int count = 0;
            while(!queue.isEmpty()) {
                int[] arr = queue.poll();
                boolean isHigh = false;

                for(int[] q : queue) {
                    if(q[1] > arr[1]) {
                        isHigh = true;
                        break;
                    }
                }

                if(isHigh) {
                    queue.add(arr);
                } else {
                    count++;
                    if(arr[0] == M) {
                        sb.append(count).append("\n");
                        break;
                    }
                }
            }
        }
        System.out.println(sb);
    }
}
