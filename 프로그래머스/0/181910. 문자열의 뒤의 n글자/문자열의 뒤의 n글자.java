class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i = 0; i<my_string.length(); i++){
            if(i>=my_string.length()-n) answer += my_string.charAt(i);
        }
        return answer;
    }
}