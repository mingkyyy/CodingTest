import java.util.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        String answer = "Yes";
        Queue<String> q1 = new LinkedList<>();
        Queue<String> q2 = new LinkedList<>();
        for(int i = 0; i<cards1.length; i++){
            q1.add(cards1[i]);
        }
        for(int j = 0; j<cards2.length; j++){
            q2.add(cards2[j]);
        }
        for(int i = 0; i< goal.length; i++){
            String tmp = goal[i];
            if(tmp.equals(q1.peek())) q1.poll();
             else if(tmp.equals(q2.peek())) q2.poll();
            else {
                answer = "No";
                break;
            }
        }
        return answer;
    }
}