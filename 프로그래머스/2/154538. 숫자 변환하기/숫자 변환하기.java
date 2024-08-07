import java.util.*;

class Solution {
    public int solution(int x, int y, int n) {
        int answer = 0;
        int dp[] = new int[y+1];
        
        for(int i = 0; i<=y; i++){
            dp[i] = Integer.MAX_VALUE;
        }
        
        dp[x] = 0;
        for(int i = x; i<=y; i++){
            if(dp[i] == Integer.MAX_VALUE) continue;
            if(i+n <= y) dp[i+n] = Integer.min(dp[i+n],dp[i]+1);
            if(i*2 <=y) dp[i*2] = Integer.min(dp[i*2], dp[i]+1);
         if(i*3 <= y) dp[i*3] = Integer.min(dp[i*3], dp[i]+1);
        }
        if(dp[y] == Integer.MAX_VALUE) answer = -1;
        else answer = dp[y];
        return answer;
    }
}

