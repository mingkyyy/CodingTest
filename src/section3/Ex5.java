package section3;

import java.util.Scanner;

public class Ex5 {
    public int solution(int n) {
        int answer = 0;
        int i = 1;
        while (i < (n / 2 + 1)) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                }
            }
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Ex5 T = new Ex5();
        System.out.println(T.solution(n));
    }
}
