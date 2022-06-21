package section2;

import java.util.Scanner;

public class Ex4 {
    public int[] solution(int n){

        int[] answer= new int[n];

        for (int i = 2; i<n; i++){
            answer[0] = 1;
            answer[1] = 1;
            answer[i] = answer[i-1]+answer[i-2];
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Ex4 T = new Ex4();
        for (int i : T.solution(n)){
            System.out.print(i+" ");
        }

    }
}
