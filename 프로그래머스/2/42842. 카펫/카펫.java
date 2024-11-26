class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int total = brown + yellow;
        
        // 가로 크기는 전체 크기의 약수
        for(int width=3; width<=total; width++) {
            if(total % width != 0) continue; // 약수가 아니면 스킵
            
            int height = total / width; // 세로는 전체 / 가로
            
            if((width - 2) * (height - 2) == yellow) {
                answer[0] = width;
                answer[1] = height;
            }
        }
        return answer;
    }
}