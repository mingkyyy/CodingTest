import java.util.*;

class Solution {
    public int solution(int[] wallet, int[] bill) {
        int answer = 0;
        Arrays.sort(wallet);
        Arrays.sort(bill);
        while(true){
            if(bill[1] >= wallet[1]) return answer;
            else bill[1] = bill[1] / 2;
            answer = bill[1];
            System.out.println(bill[1]);
            answer++;
        }
     
    
    }
}