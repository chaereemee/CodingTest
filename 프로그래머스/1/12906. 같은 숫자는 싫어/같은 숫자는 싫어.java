import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Stack<Integer> stack = new Stack<>();
        
        for(int num : arr) {
            if(stack.size() == 0 || stack.peek() != num)
                stack.push(num);
        }
        
        int[] newArr = new int[stack.size()];
        for(int i=newArr.length -1; i>=0; i--) {
            newArr[i] = stack.pop();
        }
        
        return newArr;
    }
}