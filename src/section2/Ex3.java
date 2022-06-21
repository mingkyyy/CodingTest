package section2;

import java.util.Scanner;

public class Ex3 {
    public String solution(int n, int[] array1, int[] array2) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            if (array1[i] == array2[i]) {
                answer += 'D';
            } else if (array1[i] == 1 && array2[i] == 3) {
                answer += 'A';
            } else if (array1[i] == 2 && array2[i] == 1) {
                answer += 'A';
            } else if (array1[i] == 3 && array2[i] == 2) {
                answer += 'A';
            } else {
                answer += 'B';
            }
        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array1 = new int[n];
        int[] array2 = new int[n];

        for (int i = 0; i < n; i++) {
            array1[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            array2[i] = sc.nextInt();
        }

        Ex3 T = new Ex3();

        for (char c : T.solution(n, array1, array2).toCharArray()) {
            System.out.println(c);
        }
    }
}
