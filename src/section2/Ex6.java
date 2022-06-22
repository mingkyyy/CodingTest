package section2;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {
    public boolean isPrime(int num) {
        if (num == 1) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public ArrayList<Integer> solution(int n, int[] array) {
        ArrayList<Integer> answer = new ArrayList<>();
        int[] array2 = new int[n]; //숫자 역순으로 바꿈

        for (int i = 0; i < n; i++) { //숫자 역순으로 바꾸는 공식식
            while (array[i] != 0) {
                int digit = array[i] % 10;
                array2[i] = array2[i] * 10 + digit;
                array[i] /= 10;
            }
            if (isPrime(array2[i])) answer.add(array2[i]);
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
        Ex6 T = new Ex6();
        for (int x : T.solution(n, array)) {
            System.out.print(x + " ");
        }

    }
}

