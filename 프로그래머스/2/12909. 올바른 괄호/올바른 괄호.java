import java.util.*;

class Solution {
    boolean solution(String s) {
        Stack<Character> stack = new Stack<>();
        
        boolean answer = true;
        for(Character c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
            } else if(c ==')' && !stack.isEmpty()) {
                stack.pop();
            } else {
                answer = false;
            }
        }
        
        if(stack.isEmpty() && answer) {
            return true;
        } else {
            return false;
        }
    }
}