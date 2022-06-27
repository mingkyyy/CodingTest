package section2;

import java.util.Scanner;

public class Ex8 {
    public int[] solution(int n, int[] array) {
        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            int max = 1;
            for (int j = 0; j < n; j++) {
                if (array[j] > array[i]) {
                    max++;
                }
                answer[i] = max;
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

        Ex8 T = new Ex8();
        for (int x : T.solution(n, array)){
            System.out.print(x+" ");
        }

    }
}
