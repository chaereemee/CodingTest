import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String str = br.readLine();
            if(str.equals(".")){
                break;
            }

            Stack<Character> stack = new Stack<>();
            boolean isBalanced = true;

            for(char c : str.toCharArray()){
                if(c == '(' || c == '['){
                    stack.push(c);
                } else if(c == ')') {
                    if(stack.isEmpty() || stack.pop() != '('){
                        isBalanced = false;
                        break;
                    }
                } else if(c == ']') {
                    if(stack.isEmpty() || stack.pop() != '['){
                        isBalanced = false;
                        break;
                    }
                }
            }
            
            if(isBalanced && stack.isEmpty()){
                sb.append("yes").append("\n");
            } else {
                sb.append("no").append("\n");
            }
        }

        System.out.println(sb);
    }
}