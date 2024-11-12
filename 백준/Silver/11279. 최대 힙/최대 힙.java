import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) {
                if(heap.size() == 0) {
                    sb.append("0\n");
                } else {
                    sb.append(heap.poll()).append("\n");
                }
            } else {
                heap.add(num);
            }
        }
        System.out.println(sb);
    }
}