import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader rb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(rb.readLine());
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++) {
            String str = rb.readLine();
            char[] chars = str.toCharArray();
            Stack<Character> stack = new Stack<>();
            boolean flag = true;
            
            for(int j=0; j<str.length(); j++) {
                if(chars[j]=='(') {
                    stack.push(chars[j]);
                } else if(chars[j]==')') {
                    if(stack.empty()) {
                        flag = false;
                        break;
                    }
                    stack.pop();
                }
            }
            
            if(!stack.empty()) {
                flag = false;
            }
            if(flag) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }
        System.out.println(sb.toString());
    }
}