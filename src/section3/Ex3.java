package section3;

import java.util.Scanner;

public class Ex3 {
    public int solution(int n, int k, int[] array) {

        int answer = 0;
        int sum = 0;
        for (int i = 0; i < k; i++) {
            sum += array[i];
        }

        for (int i = k; i < n; i++) {

            sum += (array[i] - array[i - k]);
            answer = Math.max(answer, sum);
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        Ex3 T = new Ex3();
        System.out.println(T.solution(n, k, array));

    }
}
