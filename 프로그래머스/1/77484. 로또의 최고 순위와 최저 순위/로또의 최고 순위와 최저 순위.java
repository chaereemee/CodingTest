class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int count = 0;
        int zeroCount = 0;
        
        for(int win_num : win_nums) {
            for(int i=0; i<lottos.length; i++) {
                if(lottos[i] == win_num) {
                    count++;
                }
            }
        }
        
        for(int i=0; i<lottos.length; i++) {
            if(lottos[i] == 0) {
                zeroCount++;
            }
        }
        
        int max = count + zeroCount;
        int min = count;
        
        return ranking(max, min);
    }
    
    private static int[] ranking(int max, int min) {
        int[] arr = new int[2];
        arr[0] = max;
        arr[1] = min;
        
        for(int i=0; i<arr.length; i++) {
            switch(arr[i]) {
                case 6:
                    arr[i] = 1;
                    break;
                case 5:
                    arr[i] = 2;
                    break;
                case 4:
                    arr[i] = 3;
                    break;
                case 3:
                    arr[i] = 4;
                    break;
                case 2:
                    arr[i] = 5;
                    break;
                default:
                    arr[i] = 6;
                    break;
            }
        }
        return arr;
    }
}