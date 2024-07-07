import java.util.*;

class Solution {
    public String solution(int[] food) {
        String answer = "";
        String st = "";
        int num = 0;
        
        for(int i = 0; i<food.length; i++){
            if(food[i] >=2){
                for(int j = 0; j<food[i]/2; j++){
                    st+=num;
                }
               
            }
             num++;
        }
        StringBuffer sb = new StringBuffer(st);
        String reverse = sb.reverse().toString();
        answer+=st;
        answer+=0;
        answer+=reverse;
        return answer;
    }
}