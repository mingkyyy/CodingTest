class Solution {
    public int solution(String t, String p) {
        int answer = 0;
        Long rp = Long.parseLong(p);
        int num = p.length();
        for(int i = 0; i<t.length() - num+1; i++){
            Long tmp = Long.parseLong(t.substring(i, i+num));
           if(rp >= tmp) answer++;
        }
        return answer;
    }
}