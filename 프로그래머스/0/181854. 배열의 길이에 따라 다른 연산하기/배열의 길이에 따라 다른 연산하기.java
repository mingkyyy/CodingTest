import java.util.*;

class Solution {
    public int[] solution(int[] arr, int n) {
        int length = arr.length;
        int[] answer = new int[length];
        
        for(int i = 0; i < arr.length; i++){
            int result = arr[i];
            if((length % 2 == 0 && i % 2 == 1 ) || (length % 2 == 1 && i % 2 == 0)) result = result + n;
            answer[i] = result;
        }
        return answer;
    }
}