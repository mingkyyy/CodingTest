package section2;

import java.util.Scanner;

public class Ex2 {

    public int solution(int n, int[] array) {
        int answer = 1;
        int max = array[0];

        for (int i = 1; i < n; i++) {
            if (array[i] > max) {
                answer++;
                max = array[i];
            }
//           if (array[i]>array[i-1]){
//               answer++;
//           }else {
//               array[i] = array[i-1];
//           }

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
        Ex2 T = new Ex2();
        System.out.println(T.solution(n, array));

    }
}
