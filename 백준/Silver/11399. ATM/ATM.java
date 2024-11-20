import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> heap = new PriorityQueue<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i = 0; i < n; i++) {
            heap.add(Integer.parseInt((st.nextToken())));
        }

        int sum = 0;
        for(int i = n; i > 0; i--) {
            sum += heap.poll() * i;
        }

        System.out.println(sum);
    }
}