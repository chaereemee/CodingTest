import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        for(Character c : s.toCharArray()) {
            if(stack.isEmpty() || c == '(') {
                stack.push(c);
            } else if(c == ')' && stack.peek() == '(') {
                stack.pop();
            } else {
                break;
            }
        }
        
        if(stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}