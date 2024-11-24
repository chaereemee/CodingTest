class Solution {
    static char[] alpha = {'A', 'E', 'I', 'O', 'U'};
    static int count = 0;
    static int result = 0;
    public int solution(String word) {
        DFS("", word);
        return result - 1;
    }
    
    private static void DFS(String current, String target) {
        // 단어의 최대 길이는 5
        if(current.length() > 5) return;
        
        // 순서를 계산
        count++;
        
        // 현재 단어가 목표 단어와 같다면 순서를 저장하고 종료
        if(current.equals(target)) {
            result = count;
            return;
        }
        
        // 모음을 하나씩 추가하여 탐색
        for(char c : alpha) {
            DFS(current + c, target);
        }
    }
}