class Solution {
    public int[] solution(String[] park, String[] routes) {
        int x = 0;
        int y = 0;
        
        // 시작 위치 'S' 찾기
        for(int i=0; i<park.length; i++) {
            if(park[i].contains("S")) {
                x = i;
                y = park[i].indexOf("S");
                break;
            }
        }
        
        // 명령어 처리
        for(String route : routes) {
            String direction = route.split(" ")[0];
            int step = Integer.parseInt(route.split(" ")[1]);
            
            int nx = x; // 이동 중 x 좌표
            int ny = y; // 이동 중 y 좌표
            
            for(int i=0; i<step; i++) {
                switch(direction) {
                    case "E":
                        ny++;
                        break;
                    case "W":
                        ny--;
                        break;
                    case "S":
                        nx++;
                        break;
                    case "N":
                        nx--;
                        break;
                }
                
                // 경계 검사
                if(nx >= 0 && ny >= 0 && nx < park.length && ny < park[0].length()) {
                    // 장애물 검사
                    if(park[nx].charAt(ny) == 'X') {
                        break;
                    }
                    
                    // 이동 완료 시 위치 갱신
                    if(i == step - 1) {
                        x = nx;
                        y = ny;
                    }
                } else {
                    break; // 범위를 벗어나면 이동 취소
                }
            }
        }
        return new int[] {x, y};
    }
}