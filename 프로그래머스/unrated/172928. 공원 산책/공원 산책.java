class Solution {
    public int[] solution(String[] park, String[] routes) {
        int Sx = 0;
        int Sy = 0;
        int H = park.length;
        int W = park[0].length();
        
        char[][] arr = new char[H][W];       // 직사각형 
        
        for(int i = 0; i < H; i++){          // S의 위치 찾는 반복문
            arr[i] = park[i].toCharArray();
                if(park[i].contains("S")){
                    Sy = i;
                    Sx = park[i].indexOf("S");
            }
        }
        
        
        for(String st : routes){
            String dir = st.split(" ")[0];
            int figure = Integer.parseInt(st.split(" ")[1]);

            int x = Sx; // S위치 복사, 장애물이나 벽 만나면 Sx,Sy 위치 보존을 위해
            int y = Sy;
            
            for(int j = 0; j < figure; j++){
                if(dir.equals("N")){
                    y--;
                }if(dir.equals("S")){
                    y++;
                }if(dir.equals("E")){
                    x++;
                }if(dir.equals("W")){
                    x--;
                }if(x >= 0 && y >= 0 && x < W && y < H){
                    if (arr[y][x] == 'X'){
                     break;
                    } 
                    if(j == (figure -1)){
                        Sx = x;
                        Sy = y;
                    }
                }
            }    
        }
        
        int[] answer = {Sy,Sx};
        return answer;
    }
}