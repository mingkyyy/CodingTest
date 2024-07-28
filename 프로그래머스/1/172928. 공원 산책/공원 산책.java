

class Point{
    int x;
    int y;
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }
}


class Solution {
    
    char result[][];
    
    public Point distance(Point start, String a, int b) {
         Point tmp = start;
        for (int i = 0; i < b; i++) {
            if (a.equals("E")) {
                int num = tmp.y + 1;
                if (num >=0 && num<result[0].length && result[start.x][num] != 'X') {
                     tmp = new Point(tmp.x, num);
                } else return start;

            } else if (a.equals("W")) {
                int num = tmp.y - 1;
                if (num >=0 && num<result[0].length && result[start.x][num] != 'X') {
                    tmp = new Point(tmp.x, num);
                }else return start;

            } else if (a.equals("N")) {
                int num = tmp.x - 1;
                if (num >=0 && num<result.length &&result[num][start.y] != 'X') {
                    tmp = new Point(num, tmp.y);
                }else return start;
            } else if (a.equals("S")) {
                int num = tmp.x + 1;
                if (num >=0 && num<result.length && result[num][start.y] != 'X') {
                    tmp = new Point(num, tmp.y);
                } else return start;

            }


        }


        return tmp;
}
    
    public int[] solution(String[] park, String[] routes) {
      int[] answer = new int[2];
        result = new char[park.length][park[0].length()];
        Point start = null;

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                result[i][j] = park[i].charAt(j);
                if (result[i][j] == 'S') start = new Point(i, j);
            }
        }




        for (int i = 0; i < routes.length; i++) {
            String[] st = routes[i].split(" ");
            String a = st[0];
            int b = Integer.parseInt(st[1]);
            start = distance(start, a, b);
            System.out.println(start.x+" " + start.y);


        }

        answer[0] = start.x;
        answer[1] = start.y;
        
        return answer;
    }
}