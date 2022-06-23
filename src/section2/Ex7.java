package section2;

import java.util.Scanner;

public class Ex7 {
    public int solution(int n, int[] array) {
        int answer = 0;
        int count = 1;

        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {
                answer = answer + count;
                count++;
            } else {
                count = 1;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = sc.nextInt();
        }
        Ex7 T = new Ex7();
        System.out.println(T.solution(n, array));
    }
}
