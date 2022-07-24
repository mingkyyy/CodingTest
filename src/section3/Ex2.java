package section3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ex2 {
    public ArrayList<Integer> solution(int n, int[] array, int m, int[] array2) {
        ArrayList<Integer> answer = new ArrayList<>();

        Arrays.sort(array);
        Arrays.sort(array2);

        int p1 = 0, p2 = 0;

        while (p1 < n && p2 < m) {
            if (array[p1] > array2[p2])
                p2++;
            else if (array[p1] < array2[p2])
                p1++;
            else {
                answer.add(array[p1]);
                p1++;
                p2++;
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

        int m = sc.nextInt();
        int[] array2 = new int[n];

        for (int i = 0; i < m; i++) {
            array2[i] = sc.nextInt();
        }

        Ex2 T = new Ex2();
        for (int i : T.solution(n, array, m, array2)) {
            System.out.print(i + " ");
        }

    }
}
