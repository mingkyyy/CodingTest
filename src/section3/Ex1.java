package section3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex1 {
    public ArrayList<Integer> solution(int n, int[] array, int m, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (array[p1] < array2[p2]) {
                answer.add(array[p1++]);
            } else if (array[p1] > array2[p2]) {
                answer.add(array2[p2++]);
            } else {
                answer.add(array[p1++]);
                answer.add(array2[p2++]);
            }
        }

        if (p1 < n) {
            for (int i = p1; i < n; i++) {
                answer.add(array[i]);
            }
        } else {
            for (int i = p2; i < m; i++) {
                answer.add(array2[i]);
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

        int m = scanner.nextInt();
        int[] array2 = new int[m];
        for (int i = 0; i < m; i++) {
            array2[i] = scanner.nextInt();
        }
        Ex1 T = new Ex1();
        for (int i : T.solution(n, array, m, array2)) {
            System.out.print(i + " ");
        }

    }
}
