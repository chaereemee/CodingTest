class Solution {
    public long solution(int price, int money, int count) {
        long prices = 0;
        for(int i=1; i<=count; i++) {
            prices += price*i;
        }
        
        if(prices - money <= 0) {
            return 0;
        } else {
            return prices - money;
        }
    }
}