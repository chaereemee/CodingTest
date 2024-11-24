class Solution {
    public int solution(int a, int b, int n) {
        int totalBottle = 0;
        while(n >= a) {
            int exchangeCola = (n / a) * b;
            n = (n % a) + exchangeCola;
            
            totalBottle += exchangeCola;
        }
        return totalBottle;
    }
}