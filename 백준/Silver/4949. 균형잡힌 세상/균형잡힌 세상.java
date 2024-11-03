import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        boolean ctn = true;
        while(ctn) {
            String str = br.readLine();
            if(str.equals(".")) break;

            Stack<Character> stack = new Stack<>();
            for(int i=0; i<str.length(); i++) {
                if(str.charAt(i) == '(' || str.charAt(i) == '[') {
                    stack.push(str.charAt(i));
                } else if(str.charAt(i) == ')') {
                    if(stack.isEmpty()) stack.push(str.charAt(i));
                    else if(stack.peek() == '(') stack.pop();
                    else break;
                } else if(str.charAt(i) == ']') {
                    if(stack.isEmpty()) stack.push(str.charAt(i));
                    else if(stack.peek() == '[') stack.pop();
                    else break;
                }
            }

            if(!stack.isEmpty()) {
                sb.append("no").append("\n");
            } else {
                sb.append("yes").append("\n");
            }
        }
        System.out.println(sb);
    }
}