import java.util.*;

class Solution {
    public String solution(String s, String skip, int index) {
        String answer = "";
        //int count=1;
        char tmp = ' ';
        ArrayList<Character> list = new ArrayList<>();
        for(char c : s.toCharArray()){
            while(list.size()<=index){
                if(c == 'z') tmp ='a';
                else tmp = (char)(c+1);
                if(skip.indexOf(tmp) == -1) list.add(tmp);
                c = tmp;
            }
           answer+=list.get(index-1);
            list = new ArrayList<>();
            
        }
        return answer;
    }
}