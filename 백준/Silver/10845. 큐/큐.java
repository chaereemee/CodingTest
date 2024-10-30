import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Deque<Integer> deque = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<N; i++) {
            String str = br.readLine();

            if(str.startsWith("push")) {
                deque.addLast(Integer.parseInt(str.split(" ")[1]));
            } else if(str.equals("front")) {
                if(deque.isEmpty()) sb.append("-1\n");
                else sb.append(deque.peekFirst()).append("\n");
            } else if(str.equals("back")) {
                if(deque.isEmpty()) sb.append("-1\n");
                else sb.append(deque.peekLast()).append("\n");
            } else if(str.equals("size")) {
                sb.append(deque.size()).append("\n");
            } else if(str.equals("pop")) {
                if(deque.isEmpty()) sb.append("-1\n");
                else sb.append(deque.removeFirst()).append("\n");
            } else if(str.equals("empty")) {
                if(deque.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
        }
        System.out.println(sb);
    }
}