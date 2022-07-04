package section2;

import java.util.Scanner;

public class Ex9 {
    public int solution(int n, int[][] array) {
        int answer = 0;
        int sum = 0, sum2 = 0, sum3 = 0, sum4 = 0;
        int nn=n-1;


        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                sum += array[i][j];
                sum2 += array[j][i];
            }

            if (answer < sum) {
                answer = sum;
            }
            if (answer < sum2) {
                answer = sum2;
            }
            sum = 0;
            sum2 = 0;

            sum3 += array[i][i];
            sum4 += array[nn][i];
            nn = nn-1;

        }

        if (answer < sum3) {
            answer = sum3;
        }
        if (answer < sum4) {
            answer = sum4;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = sc.nextInt();
            }
        }

        Ex9 T = new Ex9();
        System.out.println(T.solution(n, array));

    }
}
