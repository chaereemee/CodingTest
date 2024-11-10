import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        boolean answer = true;
        
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c == ')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                answer =false;
                break;
            }
        }
        
        if(answer && stack.isEmpty())
            return true;
        else 
            return false;
    }
}