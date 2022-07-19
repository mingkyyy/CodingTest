package section2;

import java.util.Scanner;

public class Ex11 {
    public int solution(int n, int[][] array) {
        int answer = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 1; i <= n; i++) {
            int cnt = 0;
            for (int j = 1; j <= n; j++) {
                for (int k = 1; k < 5; k++) {
                    if (array[i][k] == array[j][k]) {
                        cnt++;
                        break;
                    }
                }
            }
            if (cnt > max) {
                max = cnt;
                answer = i;
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n + 1][6];

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= 5; j++) {
                array[i][j] = sc.nextInt();
            }
        }
        Ex11 T = new Ex11();
        System.out.println(T.solution(n, array));

    }
}
