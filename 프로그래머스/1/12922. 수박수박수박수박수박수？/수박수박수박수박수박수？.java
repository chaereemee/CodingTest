class Solution {
    public String solution(int n) {
        char[] patten = {'수', '박'};
        String str = "";
        
        for(int i=0; i<n; i++) {
            if(i % 2 == 0) {
                str += String.valueOf(patten[0]);
            } else {
                str += String.valueOf(patten[1]);
            }
        }
        
        return str;
    }
}