class Solution {
    public int solution(int n) {
        // 10진수를 3진수로 변환
        String three = Integer.toString(n, 3);
        
        // 3진수 뒤집기
        String reversed = new StringBuilder(three).reverse().toString();
        
        // 뒤집은 3진수 10진수로 변환
        int result = Integer.parseInt(reversed, 3);
        
        return result;
    }
}