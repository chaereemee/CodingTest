import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<N; i++) {
            String str = br.readLine();
            if(str.startsWith("push")) {
                int num = Integer.parseInt(str.split(" ")[1]);
                stack.push(num);
            } else if(str.equals("pop")) {
                if(stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.pop()).append("\n");
            } else if(str.equals("top")) {
                if(stack.isEmpty()) sb.append("-1\n");
                else sb.append(stack.peek()).append("\n");
            } else if(str.equals("size")) {
                sb.append(stack.size()).append("\n");
            } else if(str.equals("empty")) {
                if(stack.isEmpty()) sb.append("1\n");
                else sb.append("0\n");
            }
        }
        
        System.out.println(sb);
    }
}