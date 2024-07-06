import java.util.*;

class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 0; // 페인트칠 해야 하는 최소 횟수는?
        // n :  벽의 길이 M -> 롤러의 길이 secion -> 구역들의 번호
       int max = 0;
        for(int i = 0; i<section.length; i++){
            if(section[i] < max){
                continue;
            }
            answer+=1;
            max = section[i] + m;
        }
        return answer;
    }
}