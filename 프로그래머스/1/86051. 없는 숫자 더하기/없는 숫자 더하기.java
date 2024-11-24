class Solution {
    public int solution(int[] numbers) {
        int totalSum = 45;
        
        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        
        return totalSum - sum;
    }
}