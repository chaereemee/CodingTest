import java.util.*;

class Solution {
    static int[] arr1 = {1, 2, 3, 4, 5};
    static int[] arr2 = {2, 1, 2, 3, 2, 4, 2, 5};
    static int[] arr3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
    static int[] score = {0, 0, 0};
    
    public int[] solution(int[] answers) {        
        for(int i=0; i<answers.length; i++) {
            if(answers[i] == arr1[i % arr1.length]) score[0]++;
            if(answers[i] == arr2[i % arr2.length]) score[1]++;
            if(answers[i] == arr3[i % arr3.length]) score[2]++;
        }
        
        // 최대 점수 계산
        int maxScore = Math.max(score[0], Math.max(score[1], score[2]));
        
        // 최대 점수를 가진 사람 찾기
        List<Integer> result = new ArrayList<>();
        for(int i=0; i<score.length; i++) {
            if(maxScore == score[i]) {
                result.add(i + 1); // 1번 사람부터
            }
        }
        
        int[] answer = new int[result.size()];
        for(int i=0; i<result.size(); i++) {
            answer[i] = result.get(i);
        }
        
        return answer;
    }
}