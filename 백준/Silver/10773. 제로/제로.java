import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<N; i++) {
            int temp = Integer.parseInt(br.readLine());
            if(temp == 0) {
                if(stack.isEmpty()) {
                    System.out.println(0);
                    return;
                } else {
                    stack.pop();
                }
            } else {
                stack.push(temp);
            }
        }

        int sum = 0;
        while(!stack.isEmpty()) {
            sum += stack.pop();
        }
        System.out.println(sum);
    }
}