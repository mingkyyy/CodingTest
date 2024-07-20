import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i<participant.length; i++){
            map.put(participant[i], map.getOrDefault(participant[i],0)+1);
        }
        for(int i = 0; i<completion.length; i++){
            map.put(completion[i], map.get(completion[i])-1);
        }
        for(String s : map.keySet()){
            if(map.get(s)>0) answer+=s;
        }
        
        return answer;
    }
}