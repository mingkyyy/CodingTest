import java.util.*;

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this. y = y;
    }
}

class Solution {
    int dx[] = {-1, 0, 1, 0};
    int dy[] = {0, 1, 0, -1};
    int check[][];
    
    public int bfs(Point start, Point end, String[] board){
    Queue<Point> queue = new LinkedList<>();
        queue.add(start);
        check[start.x][start.y] = 1;
        while(!queue.isEmpty()){
            Point tmp = queue.poll();
            for(int i = 0; i<4; i++){
                int x = tmp.x;
                int y = tmp.y;
                int nx = dx[i];
                int ny = dy[i];
                while(x+nx>=0 && x+nx<board.length && y+ny >=0 && y+ny<board[0].length() && board[x+nx].charAt(y+ny) != 'D'){
                    x += nx;
                    y += ny;
                }
          
                if(check[x][y] == 0){
                    check[x][y] = check[tmp.x][tmp.y] + 1;
                    queue.add(new Point(x, y));
                      if (x == end.x && y == end.y) return check[x][y]-1 ;
                    
                }

            }
        
            
            }
        return -1;
        }
    

    public int solution(String[] board) {
        check = new int[board.length][board[0].length()];
      Point start = new Point(0,0);
      Point end = new Point(0,0);
        
        
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[i].length(); j++){
                if(board[i].charAt(j) == 'R'){
                    start = new Point(i, j);
                }
                if(board[i].charAt(j) == 'G'){
                    end = new Point(i, j);
                }
            }
        }
        int answer = 0;
        answer = bfs(start, end, board);

        return answer;
    }
}