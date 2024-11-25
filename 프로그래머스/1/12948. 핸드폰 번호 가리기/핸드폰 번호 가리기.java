import java.util.*;

class Solution {
    static StringBuilder sb = new StringBuilder();
    public String solution(String phone_number) {
        for(int i=0; i<phone_number.length()-4; i++) {
            sb.append("*");
        }
        
        for(int i=phone_number.length()-4; i<phone_number.length(); i++) {
            sb.append(phone_number.charAt(i));
        }
        
        return sb.toString();
    }
}