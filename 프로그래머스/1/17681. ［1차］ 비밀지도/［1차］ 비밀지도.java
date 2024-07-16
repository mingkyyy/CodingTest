class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
 String[] answer = new String[n];
        int result1[][] = new int[n][n];
        int result2[][] = new int[n][n];

        for (int i = 0; i<n; i++){
            String tmp = Integer.toString(arr1[i],2);
            for(int j = 0; j<n; j++){
                if (tmp.length() == n){
                    result1[i][j] = tmp.charAt(j)-'0';
                }else{
                    int num = n-tmp.length();
                    if (j < num){
                        result1[i][j] = 0;
                    }else{
                        result1[i][j] = tmp.charAt(j-num)-'0';
                    }
                }
            }
        }

        for (int i = 0; i<n; i++){
            String tmp = Integer.toString(arr2[i],2);
            for(int j = 0; j<n; j++){
                if (tmp.length() == n){
                    result2[i][j] = tmp.charAt(j)-'0';
                }else{
                    int num = n-tmp.length();
                    if (j < num){
                        result2[i][j] = 0;
                    }else{
                        result2[i][j] = tmp.charAt(j-num)-'0';
                    }
                }
            }
        }

        for(int i = 0; i<n; i++){
            answer[i]="";
            for(int j = 0; j<n; j++){
                if (result1[i][j] == 1 || result2[i][j] == 1){
                    answer[i]+="#";
                }else{
                    answer[i]+=" ";
                }
            }
        }
        
        return answer;
    }
}