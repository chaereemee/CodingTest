import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        // 전환
        String[] strArr = new String[numbers.length];
        for(int i=0; i<numbers.length; i++) {
            strArr[i] = String.valueOf(numbers[i]);
        }
        
        // 정렬
        Arrays.sort(strArr, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return (b+a).compareTo(a+b);
            }
        });
        
        // 모든 값이 0인 경우 "0" 반환
        if(strArr[0].equals("0")) {
            return "0";
        }
        
        StringBuilder sb = new StringBuilder();
        for(String str : strArr) {
            sb.append(str);
        }
        
        return sb.toString();
    }
}