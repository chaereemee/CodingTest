class Solution {
    public int solution(int n) {
        n -= 1;
        int result = 0;
        for(int i=2; i<=n; i++) {
            if(n % i == 0) {
                result = i;
                break;
            }
        }
        return result;
    }
}