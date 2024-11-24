class Solution {
    public int[] solution(String s) {
        
        int[] result = new int[s.length()];
        result[0] = -1;
        for(int i=1; i<s.length(); i++) {
            for(int j=0; j<i; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    result[i] = i-j;
                }
            }
            if(result[i] == 0) result[i] = -1;
        }
        
        return result;
    }
}