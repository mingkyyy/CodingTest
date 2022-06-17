package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();

        answer.add(array[0]);

        for (int i = 1; i < n; i++) {
            if (array[i] > array[i - 1]) {
                answer.add(array[i]);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();

        }

        Ex1 T = new Ex1();
        for (int x : T.solution(n, array)) {
            System.out.print(x + " ");
        }
    }
}
