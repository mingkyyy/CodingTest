class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        int count = 0;
        int zero = 0;
        
        for(int i = 0; i<lottos.length; i++){
            if(lottos[i] == 0) {
                zero++;
                continue;
            }
            for(int j = 0; j<lottos.length; j++){
                if(lottos[i] == win_nums[j]){
                    count++;
                }
            }
        }
        
        if(zero == 6){
            answer[0] = 1;
            answer[1] = 6;
        }else if(count<2){
            answer[1] = 6;
            if(count + zero <2){
                answer[0] = 6;
            }else answer[0] = 7-(count+zero);
        }else{
            answer[1] = 7-count;
            answer[0] = answer[1]-zero;
            if(answer[0] <1) answer[0] = 1;
        }
        return answer;
    }
}