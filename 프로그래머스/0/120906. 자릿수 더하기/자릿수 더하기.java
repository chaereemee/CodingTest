class Solution {
    public int solution(int n) {
        int answer = 0;
        String newN = Integer.toString(n);
        for(int i=0; i < newN.length(); i++) {
            answer += newN.charAt(i) - '0';
        }
        return answer;
    }
}