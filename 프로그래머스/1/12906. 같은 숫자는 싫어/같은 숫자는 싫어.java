import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i<arr.length; i++){
           if(stack.isEmpty()) stack.push(arr[i]);
            else if(stack.peek() != arr[i]) stack.push(arr[i]);
        }
        int[] answer = new int[stack.size()];
        
        for(int i = 0; i<stack.size(); i++){
            answer[i] = stack.get(i);
        }
        return answer;
    }
}