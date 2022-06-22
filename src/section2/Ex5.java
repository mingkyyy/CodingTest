package section2;

import java.util.Scanner;

public class Ex5 {
    public int solution(int n) {
        int answer = 0;
        int[] ints = new int[n + 1];

        for (int i = 2; i <= n; i++) {
            if (ints[i] == 0) {
                answer++;
                for (int j = i; j <= n; j = j + i) {
                    ints[j] = 1;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Ex5 T = new Ex5();
        System.out.println(T.solution(n));

    }
}
